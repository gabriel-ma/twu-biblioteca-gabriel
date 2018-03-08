package com.twu.biblioteca;

public class BibliotecaApp {

    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public String printWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String listAvaliableBooks() {
        return generateLines() + books.listAvaliableBooks();
    }

    private String generateLines(){
        return "------------------------------\n";
    }

}
