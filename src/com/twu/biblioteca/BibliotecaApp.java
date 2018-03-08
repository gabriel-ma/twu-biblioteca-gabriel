package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;

public class BibliotecaApp {
    BookController bookController = new BookController();
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }

    public String printWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String listAvaliableBooks() {
        return bookController.listAvaliableBooks();
    }

    public String printMainMenu(){
        StringBuffer mainMenu = new StringBuffer();
        mainMenu.append("1. List available books");
        return mainMenu.toString();
    }

    public void startBibliotecaApp(){
        printWelcomeMessage();
        printMainMenu();
    }

    private void selectCostumerOption(){

    }
}
