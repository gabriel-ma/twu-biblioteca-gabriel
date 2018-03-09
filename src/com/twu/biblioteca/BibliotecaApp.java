package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;

import java.util.Scanner;

public class BibliotecaApp {
    static BookController bookController = new BookController();
    static Scanner sc;
    private boolean flagQuit;
    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        bibliotecaApp.startBibliotecaApp();
    }

    public String printWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String listAvaliableBooks() {
        return bookController.listAvaliableBooks();
    }

    public String printMainMenu(){
        StringBuffer mainMenu = new StringBuffer();
        mainMenu.append("1. List books");
        mainMenu.append("4. Quit");
        return mainMenu.toString();
    }

    public String checkOutBook(int bookId){

        return bookController.checkoutBook(bookId);
    }

    public void startBibliotecaApp(){

        sc = new Scanner(System.in);
        flagQuit = false;

        System.out.println(printWelcomeMessage());
        while(!flagQuit) {
            System.out.println(printMainMenu());
            selectCostumerOption();
        }
    }

    private void selectCostumerOption(){
        int costumerOption = sc.nextInt();
        switch (costumerOption){
            case 1:
                System.out.println(listAvaliableBooks());
                 break;
            case 4:
                setFlagQuit(true);
            default:
                System.out.println(invalidOptionMessage());

        }

    }

    public String invalidOptionMessage(){
        return "Select a valid option!";
    }

    private void setFlagQuit(boolean option){
        flagQuit = option;
    }

}
