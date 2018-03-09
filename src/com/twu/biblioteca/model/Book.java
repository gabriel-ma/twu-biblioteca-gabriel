package com.twu.biblioteca.model;

public class Book {


    private boolean available;
    private String title, author;
    private int bookId, publishing_year;



    public Book(int bookId, boolean available, String title, String author, int publishing_year) {
        this.available = available;
        this.title = title;
        this.author = author;
        this.publishing_year = publishing_year;
        this.bookId = bookId;
    }

    public Book(boolean available) {
        this.available = available;
    }

    public int getBookId() {
        return bookId;
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
    public void setAvailable(boolean available) {
        this.available = available;
    }
    public boolean isAvailable() {
        return available;
    }
    public  String getBookDetails(){
        return String.format("%s     |%s      |%s%n", this.getTitle(), this.getAuthor(), this.getPublishing_year());
    }
}
