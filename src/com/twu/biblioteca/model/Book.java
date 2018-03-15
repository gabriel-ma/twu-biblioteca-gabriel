package com.twu.biblioteca.model;

public class Book extends Item{


    private String  author;


    public Book(boolean available, String user) {
        super(available);
        this.user = user;
    }

    private String user;

    public Book(int id, int publishingYear, boolean available, String title, String author) {
        super(id, publishingYear, available, title);
        this.author = author;

    }

    public Book(boolean available) {
        super(available);
    }


    public String getAuthor() {

        return author;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }
    public String getDetails() {
        return String.format("%s     |%s      |%s%n", this.getTitle(), this.getAuthor(), this.getPublishingYear());
    }
}
