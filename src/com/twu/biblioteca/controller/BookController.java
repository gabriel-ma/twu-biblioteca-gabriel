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
             availableBooks.append(book.getBookDetails());
        }
        return generateHead() + availableBooks.toString();
    }

    private String generateHead(){
        StringBuffer head = new StringBuffer();
        head.append(printColumns());
        head.append("------------------------------\n");
        return head.toString();
    }

    private String printColumns() {
        return "Title       |Author       | Publishing Year\n";
    }


    public void generatePreExistingListofBooks(){
        books.add(new Book(true, "book 1", "Author1", 1996));
        books.add(new Book(true, "book 2", "Author2", 1948));
        books.add(new Book(true, "book 3", "Author3", 2008));
    }


}
