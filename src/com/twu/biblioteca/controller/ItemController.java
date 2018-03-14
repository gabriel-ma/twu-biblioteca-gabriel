package com.twu.biblioteca.controller;

public abstract class ItemController {

    public abstract String listAvailable();

    protected String generateHead(){
        StringBuffer head = new StringBuffer();
        head.append(printColumns());
        head.append("--------------------------------------------------\n");
        return head.toString();
    }
    protected abstract String printColumns();

}