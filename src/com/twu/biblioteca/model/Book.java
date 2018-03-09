package com.twu.biblioteca.model;

public class Book {
    private boolean available;
    private String title, author;
    private int publishing_year;



    public Book(boolean available, String title, String author, int publishing_year) {
        this.available = available;
        this.title = title;
        this.author = author;
        this.publishing_year = publishing_year;
    }

    public String getTitle() {
        return title;
    }
    public int getPublishing_year() {
        return publishing_year;
    }

    public String getAuthor() {

        return author;
    }

    public boolean isAvailable() {
        return available;
    }
    public  String getBookDetails(){
        return String.format("%s     |%s      |%s%n", this.getTitle(), this.getAuthor(), this.getPublishing_year());
    }
}
