package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookController {
    ArrayList<Book> books = new ArrayList<Book>();

    public BookController() {
        generatePreExistingListofBooks();
    }

    public String listAvaliableBooks(){
        StringBuffer availableBooks = new StringBuffer();

        for(Book book : books){
            if(book.isAvailable())
                availableBooks.append(book.getBookDetails());
        }
        return generateHead() + availableBooks.toString();
    }
    public String checkoutBook(int bookId){
        Book bookToCheckout = books.stream()
                .filter(b -> b.getBookId() == bookId && b.isAvailable())
                .findFirst().orElse(new Book(false));

        return bookToCheckout.isAvailable() ?  checkoutBook(bookToCheckout) : unsucessfulCheckOutMessage();
    }
    public String returnBook(int bookId){
        Book returnedBook = books.stream()
                .filter(b -> b.getBookId() == bookId && !b.isAvailable())
                .findFirst().orElse(new Book(true));

        return !returnedBook.isAvailable() ?  returntBook(returnedBook) : unsucessfulReturnMessage();

    }
    private String generateHead(){
        StringBuffer head = new StringBuffer();
        head.append(printColumns());
        head.append("------------------------------\n");
        return head.toString();
    }

    private String printColumns() {
        return "Title       |Author        | Publishing Year\n";
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
        books.add(new Book(1,true, "book 1", "Author1", 1996));
        books.add(new Book(2,false, "book 2", "Author2", 1948));
        books.add(new Book(3,true, "book 3", "Author3", 2008));
    }
}
