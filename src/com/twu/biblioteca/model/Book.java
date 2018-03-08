package com.twu.biblioteca.model;

public class Book {
    private boolean available;
    private String title;


    public boolean isAvailable() {
        return available;
    }

    public Book(boolean available, String title) {
        this.available = available;
        this.title = title;

    }

    public String getTitle() {
        return title;
    }
}
