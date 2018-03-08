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
        assertEquals("1. book 1\n2. book 2\n3. book 3", biblioteca.listAvaliableBooks());
    }


}
