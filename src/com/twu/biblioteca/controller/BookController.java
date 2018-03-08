package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Book;

import java.util.ArrayList;

public class BookController {
    ArrayList<Book> books = new ArrayList<Book>();

    public String listAvaliableBooks(){
        StringBuffer availableBooks = new StringBuffer();
        generatePreExistingListofBooks();
        for(Book book : books){
             availableBooks.append(getBookDetails(book));
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

    private String getBookDetails(Book book){
        return String.format("%s     |%s      |%s%n", book.getTitle(), book.getAuthor(), book.getPublishing_year());
    }
    private void generatePreExistingListofBooks(){
        books.add(new Book(true, "book 1", "Author1", 1996));
        books.add(new Book(true, "book 2", "Author2", 1948));
        books.add(new Book(true, "book 3", "Author3", 2008));
    }


}
