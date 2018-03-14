package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Librarian;

public class LibrarianController extends UserController {
    public LibrarianController() {
        super(new Librarian("librarian"));
    }


    @Override
    public String menuOption() {
        return user.menuOption();
    }
}
