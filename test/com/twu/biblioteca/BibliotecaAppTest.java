package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    BibliotecaApp biblioteca;

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
    }

    @Test
    public void printWelcomeMessageTest() {
        String expectedWelcomeMessage = "Welcome to Biblioteca";

        String receivedMessage = biblioteca.printWelcomeMessage();

        Assert.assertEquals(expectedWelcomeMessage, receivedMessage);
    }

    @Test
    public void listAvaliableBooksTest() {
        StringBuffer detailedBooksList = new StringBuffer();
        detailedBooksList.append("Title       |Author       | Publishing Year\n");
        detailedBooksList.append("------------------------------\n");
        detailedBooksList.append("book 1     |Author1      |1996\n");
        //detailedBooksList.append("book 2     |Author2      |1948\n");
        detailedBooksList.append("book 3     |Author3      |2008\n");

        String expectedResult = biblioteca.listAvaliableBooks();

        assertEquals(detailedBooksList.toString(), expectedResult);

    }

    @Test

    public void invalidOptionMessageTest() {
        String expectedMessage = "Select a valid option!";

        String receivedMessage = biblioteca.invalidOptionMessage();

        assertEquals(expectedMessage, receivedMessage);
    }
    @Test
    public void sucessfulCheckoutBookTest(){
        String expectedMessage = "Thank you! Enjoy the book";

        String receivedMessage = biblioteca.checkOutBook(1);

        assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void unsucessfulCheckoutBookTest() {
        String expectedMessage = "That book is not available.";

        String receivedMessage = biblioteca.checkOutBook(2);

        assertEquals(expectedMessage, receivedMessage);
    }
}
