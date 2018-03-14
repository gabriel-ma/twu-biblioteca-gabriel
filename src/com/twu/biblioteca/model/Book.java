package com.twu.biblioteca.model;

public class Book extends Item{


    private String  author;


    public Book(int id, int publisinhgYear, boolean available, String title, String author) {
        super(id, publisinhgYear, available, title);
        this.author = author;

    }

    public Book(boolean available) {
        super(available);
    }


    public String getAuthor() {

        return author;
    }


    public String getDetails() {
        return String.format("%s     |%s      |%s%n", this.getTitle(), this.getAuthor(), this.getPublishingYear());
    }
}
