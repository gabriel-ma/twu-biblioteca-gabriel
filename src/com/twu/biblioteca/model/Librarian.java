package com.twu.biblioteca.model;

public class Librarian extends User {

    public Librarian(String type, String libraryNumber, String password, String name, String email, String phone) {
        super(type, libraryNumber, password, name, email, phone);
    }

    @Override
   public  String menuOption() {
        return "6. Check book\n";
    }
}
