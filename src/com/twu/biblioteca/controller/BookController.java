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
    public String checkoutBook(int bookId){
        Book bookToCheckout = books.stream()
                .filter(b -> b.getId() == bookId && b.isAvailable())
                .findFirst().orElse(new Book(false));

        return bookToCheckout.isAvailable() ?  checkoutBook(bookToCheckout) : unsucessfulCheckOutMessage();
    }
    public String returnBook(int bookId){
        Book returnedBook = books.stream()
                .filter(b -> b.getId() == bookId && !b.isAvailable())
                .findFirst().orElse(new Book(true));

        return !returnedBook.isAvailable() ?  returntBook(returnedBook) : unsucessfulReturnMessage();

    }


    protected String printColumns() {
        return "Title       |Author       | Publishing Year\n";
    }


    private String checkoutBook(Book book){
        book.setAvailable(false);
        return sucessfullCheckOutMessage();
    }
    private String returntBook(Book book){
        book.setAvailable(true);
        return sucessfullReturnMessage();
    }
    private String sucessfullCheckOutMessage(){
        return "Thank you! Enjoy the book";
    }
    private String sucessfullReturnMessage(){
        return "Thank you for returning the book.";
    }

    private  String unsucessfulCheckOutMessage(){
        return "That book is not available.";
    }
    private  String unsucessfulReturnMessage(){
        return "That is not a valid book to return.";
    }

    private void generatePreExistingListofBooks(){
        books.add(new Book(1,1998, true, "Book 1", "Author 1"));
        books.add(new Book(2,2009, false, "Book 2", "Author 2"));
        books.add(new Book(3,1997,  true, "Book 3", "Author 3"));
    }


}
