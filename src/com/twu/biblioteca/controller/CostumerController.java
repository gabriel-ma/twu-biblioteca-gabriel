package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Costumer;

public class CostumerController extends UserController {
    public CostumerController() {
        super(new Costumer("costumer", "9876-4321", "123", "gabriel", "b@a.com", "123456678"));
    }

    @Override
    public String menuOption() {
        return user.menuOption();
    }
}
