package com.twu.biblioteca;


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ExampleTest {
    BibliotecaApp biblioteca;
    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
    }

    @Test
    public void printWelcomeMessageTest() {

        Assert.assertEquals("Welcome to Biblioteca", biblioteca.printWelcomeMessage());
    }

    @Test
    public void listAvaliableBooksTest() {
        assertEquals("------------------------------\nbook 1\nbook 2\nbook 3\n", biblioteca.listAvaliableBooks());
    }


}
