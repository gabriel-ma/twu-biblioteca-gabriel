package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.User;

public abstract class UserController {
    User user;

    public UserController(User user) {
        this.user = user;
    }

    public abstract String menuOption();

    public String getUserName(){
        return user.getName();
    }
}
