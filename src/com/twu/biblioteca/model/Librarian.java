package com.twu.biblioteca.model;

public class Librarian extends User {

    public Librarian(String type) {
        super(type);
    }

    @Override
   public  String menuOption() {
        return "6. Check book\n";
    }
}
