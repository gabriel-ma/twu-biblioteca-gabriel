package com.twu.biblioteca.model;

public class Costumer extends User {
    public Costumer(String type, String libraryNumber, String password, String name, String email, String phone) {
        super(type, libraryNumber, password, name, email, phone);
    }

    @Override
    public String menuOption() {
        return "6. See information\n";
    }
}
