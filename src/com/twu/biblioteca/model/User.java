package com.twu.biblioteca.model;

public abstract class User {
    private String type;
    private String libraryNumber;
    private String password;

    public String getName() {
        return name;
    }

    private String name;
    private String email;
    private String phone;

    public abstract String menuOption();

    public User(String type, String libraryNumber, String password, String name, String email, String phone) {
        this.type = type;
        this.libraryNumber = libraryNumber;
        this.password = password;
        this.name = name;
        this.email = email;
        this.phone = phone;
    }

    public String getType() {
        return type;
    }

    public String getLibraryNumber() {
        return libraryNumber;
    }

    public String getPassword() {
        return password;
    }

    public String getInformation(){
        return "";
    }


}
