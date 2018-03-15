package com.twu.biblioteca;


import com.twu.biblioteca.view.BibliotecaApp;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BibliotecaAppTest {
    BibliotecaApp biblioteca;

    @Before
    public void setUp() {
        biblioteca = new BibliotecaApp();
        biblioteca.loginCostumer();
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
        detailedBooksList.append("--------------------------------------------------\n");
        detailedBooksList.append("Book 1     |Author 1      |1998\n");
        //detailedBooksList.append("Book 2     |Author 2      |2009\n");
        detailedBooksList.append("Book 3     |Author 3      |1997\n");

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

        String receivedMessage = biblioteca.checkOutBook(3);

        assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void unsucessfulCheckoutBookTest() {
        String expectedMessage = "That book is not available.";

        String receivedMessage = biblioteca.checkOutBook(2);

        assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void returnBookTest() {
        StringBuffer detailedBooksList = new StringBuffer();
        detailedBooksList.append("Title       |Author       | Publishing Year\n");
        detailedBooksList.append("--------------------------------------------------\n");
        detailedBooksList.append("Book 1     |Author 1      |1998\n");
        detailedBooksList.append("Book 2     |Author 2      |2009\n");
        detailedBooksList.append("Book 3     |Author 3      |1997\n");
        biblioteca.returnBook(3);
        String expectedResult = biblioteca.listAvaliableBooks();

        assertEquals(detailedBooksList.toString(), expectedResult);

    }

    @Test
    public void returnBookSucesfulMessage() {
        String expectedMessage = "Thank you for returning the book";

        String receivedMessage = biblioteca.returnBook(2);

        assertEquals(expectedMessage, receivedMessage);
    }

    @Test
    public void returnBookUnsucessfulMessage() {
        String expectedMessage = "That is not a valid book to return.";

        String receivedMessage = biblioteca.returnBook(1);

        assertEquals(expectedMessage, receivedMessage);
    }
    @Test
    public void listAvaliableMoviesTest() {
        StringBuffer detailedMoviesList = new StringBuffer();
        detailedMoviesList.append("Name       |Director       | Publishing Year      | Rating\n");
        detailedMoviesList.append("--------------------------------------------------\n");
        detailedMoviesList.append("Movie 1     |Director 1      |1996      |5\n");
        detailedMoviesList.append("Movie 2     |Director 2      |1948      |9\n");
        detailedMoviesList.append("Movie 3     |Director 3      |2008      |10\n");

        String expectedResult = biblioteca.listAvailableMovies();

        assertEquals(detailedMoviesList.toString(), expectedResult);

    }

    @Test
    public void checkOutMovieAndListNewListOfAvailableMovies() {
        String expectedMessage = "Thank you! Enjoy the movie";

        String receivedMessage = biblioteca.checkOutMovie(1);

        assertEquals(expectedMessage, receivedMessage);

        StringBuffer detailedMoviesList = new StringBuffer();
        detailedMoviesList.append("Name       |Director       | Publishing Year      | Rating\n");
        detailedMoviesList.append("--------------------------------------------------\n");

        detailedMoviesList.append("Movie 2     |Director 2      |1948      |9\n");
        detailedMoviesList.append("Movie 3     |Director 3      |2008      |10\n");

        String expectedResult = biblioteca.listAvailableMovies();

        assertEquals(detailedMoviesList.toString(), expectedResult);

    }

    @Test
    public void loginAsLibrarian() {
        StringBuffer menu = new StringBuffer();
        menu.append("1. List books\n");
        menu.append("2. Checkout book\n");
        menu.append("3. Return book\n");
        menu.append("4. List Movies\n");
        menu.append("5. Checkout movie\n");
        menu.append("6. Check book\n");
        menu.append("7. Quit\n");

        biblioteca.loginLibrarian();
        String expectedResult = biblioteca.printMainMenu();

        assertEquals(menu.toString(), expectedResult);
    }

    @Test
    public void loginAsCostumer() {
        StringBuffer menu = new StringBuffer();
        menu.append("1. List books\n");
        menu.append("2. Checkout book\n");
        menu.append("3. Return book\n");
        menu.append("4. List Movies\n");
        menu.append("5. Checkout movie\n");
        menu.append("6. See information\n");
        menu.append("7. Quit\n");

        biblioteca.loginCostumer();
        String expectedResult = biblioteca.printMainMenu();

        assertEquals(menu.toString(), expectedResult);
    }

    @Test
    public void checkWhoCheckedBookOut() {
        String expectedUser = "gabriel";
        biblioteca.loginCostumer();
        biblioteca.checkOutBook(1);
        biblioteca.loginLibrarian();
        String receivedMessage = biblioteca.checkWhoHasBook(1);
        assertEquals(expectedUser, receivedMessage);
    }

    @Test
    public void seeCostumerInformation() {
        String expected = "Name: gabriel, Emal: b@a.com, Phone: 123456678";

        String received = biblioteca.getInformation();

        assertEquals(expected, received);
    }
}
