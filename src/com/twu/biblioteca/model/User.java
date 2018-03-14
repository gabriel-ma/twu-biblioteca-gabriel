package com.twu.biblioteca.model;

public abstract class User {
    private String type;
    public abstract String menuOption();

    public User(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
