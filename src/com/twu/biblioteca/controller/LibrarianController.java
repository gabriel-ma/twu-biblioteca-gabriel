package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Librarian;

public class LibrarianController extends UserController {
    public LibrarianController() {
        super(new Librarian("librarian", "1234-5678", "123", "gabriel", "a@b.com", "123456788"));
    }


    @Override
    public String menuOption() {
        return user.menuOption();
    }
}
