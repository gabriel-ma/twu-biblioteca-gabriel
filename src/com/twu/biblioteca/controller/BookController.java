package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookController extends ItemController{
    ArrayList<Book> books = new ArrayList<>();

    public BookController() {
        generatePreExistingListofBooks();
    }

    public String listAvailable(){
        StringBuffer availableBooks = new StringBuffer();

        for(Book book : books){
            if(book.isAvailable())
                availableBooks.append(book.getDetails());
        }
        return generateHead() + availableBooks.toString();
    }
    public String checkout(int id){
        Book bookToCheckout = books.stream()
                .filter(b -> b.getId() == id && b.isAvailable())
                .findFirst().orElse(new Book(false));

        return bookToCheckout.isAvailable() ?  checkout(bookToCheckout) : unsucessfulCheckOutMessage("book");
    }
    public String returnBook(int bookId){
        Book returnedBook = books.stream()
                .filter(b -> b.getId() == bookId && !b.isAvailable())
                .findFirst().orElse(new Book(true));

        return !returnedBook.isAvailable() ?  returntBook(returnedBook) : unsucessfulReturnMessage("book");

    }


    protected String printColumns() {
        return "Title       |Author       | Publishing Year\n";
    }


    private String checkout(Book book){
        book.setAvailable(false);
        return sucessfullCheckOutMessage("book");
    }
    private String returntBook(Book book){
        book.setAvailable(true);
        return sucessfullReturnMessage("book");
    }


    private void generatePreExistingListofBooks(){
        books.add(new Book(1,1998, true, "Book 1", "Author 1"));
        books.add(new Book(2,2009, false, "Book 2", "Author 2"));
        books.add(new Book(3,1997,  true, "Book 3", "Author 3"));
    }


}
