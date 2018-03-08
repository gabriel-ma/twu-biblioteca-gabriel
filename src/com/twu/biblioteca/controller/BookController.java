package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookController {
    ArrayList<Book> books = new ArrayList<Book>();

    public String listAvaliableBooks(){
        StringBuffer availableBooks = new StringBuffer();
        generatePreExistingListofBooks();
        for(Book book : books){
            if(book.isAvailable()) availableBooks.append(book.getTitle() + "\n");
        }
        return generateLines() + availableBooks.toString();
    }

    private String generateLines(){
        return "------------------------------\n";
    }


    private void generatePreExistingListofBooks(){
        books.add(new Book(true, "book 1"));
        books.add(new Book(true, "book 2"));
        books.add(new Book(true, "book 3"));
    }
}
