package com.twu.biblioteca;

import com.twu.biblioteca.controller.BookController;

import java.util.Scanner;

public class BibliotecaApp {
    static BookController bookController = new BookController();
    static Scanner sc = new Scanner(System.in);;
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
        mainMenu.append("1. List books\n");
        mainMenu.append("2. Checkout book\n");
        mainMenu.append("4. Quit\n");
        return mainMenu.toString();
    }

    public String checkOutBook(){
        System.out.println("Select your book");
        System.out.println(listAvaliableBooks());
        return bookController.checkoutBook(getOption());
    }

    public String returnBook(int bookId){

        return bookController.returnBook(bookId);
    }

    public void startBibliotecaApp(){


        flagQuit = false;

        System.out.println(printWelcomeMessage());
        while(!flagQuit) {
            System.out.println(printMainMenu());
            selectCostumerOption();
        }
    }

    private int getOption(){
        return sc.nextInt();
    }

    private void selectCostumerOption(){
        int costumerOption = getOption();
        switch (costumerOption){
            case 1:
                System.out.println(listAvaliableBooks());
                 break;
            case 2:
                System.out.println(checkOutBook());
                break;
            case 4:
                setFlagQuit(true);
                break;
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
