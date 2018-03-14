package com.twu.biblioteca.view;

import com.twu.biblioteca.controller.BookController;
import com.twu.biblioteca.controller.MovieController;

import java.util.Scanner;

public class BibliotecaApp {
    static BookController bookController = new BookController();
    static Scanner sc = new Scanner(System.in);

    private boolean flagQuit;
    private MovieController movieControler = new MovieController();

    public static void main(String[] args) {
        BibliotecaApp bibliotecaApp = new BibliotecaApp();

        bibliotecaApp.startBibliotecaApp();
    }

    public String printWelcomeMessage() {
        return "Welcome to Biblioteca";
    }

    public String listAvaliableBooks() {
        return bookController.listAvailable();
    }

    public String printMainMenu() {
        StringBuffer mainMenu = new StringBuffer();
        mainMenu.append("1. List books\n");
        mainMenu.append("2. Checkout book\n");
        mainMenu.append("3. Return book\n");
        mainMenu.append("4. Quit\n");
        return mainMenu.toString();
    }

    public String chekoutBooksMessage() {
        System.out.println("Select your book");
        System.out.println(listAvaliableBooks());

        return checkOutBook(getOption());
    }

    public String checkOutBook(int bookId) {

        return bookController.checkoutBook(bookId);
    }

    public String returnBookMessage() {

        System.out.println("Which book do you want to return?");
        return returnBook(getOption());
    }

    public String returnBook(int bookId) {

        return bookController.returnBook(bookId);
    }

    public void startBibliotecaApp() {

        flagQuit = false;

        System.out.println(printWelcomeMessage());
        while (!flagQuit) {
            System.out.println(printMainMenu());
            selectCostumerOption();
        }
    }

    private int getOption() {
        return sc.nextInt();
    }

    private void selectCostumerOption() {
        int costumerOption = getOption();
        switch (costumerOption) {
            case 1:
                System.out.println(listAvaliableBooks());
                break;
            case 2:
                System.out.println(chekoutBooksMessage());
                break;
            case 3:
                System.out.println(returnBookMessage());
                break;
            case 4:
                setFlagQuit(true);
                break;
            default:
                System.out.println(invalidOptionMessage());

        }

    }

    public String invalidOptionMessage() {
        return "Select a valid option!";
    }

    private void setFlagQuit(boolean option) {
        flagQuit = option;
    }

    public String listAvaliableMovies() {
        return movieControler.listAvailable();
    }
}
