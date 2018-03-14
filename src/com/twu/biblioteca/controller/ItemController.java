package com.twu.biblioteca.controller;

public abstract class ItemController {

    public abstract String listAvailable();

    protected String generateHead(){
        StringBuffer head = new StringBuffer();
        head.append(printColumns());
        head.append("--------------------------------------------------\n");
        return head.toString();
    }
    protected String sucessfullCheckOutMessage(String type){
        return "Thank you! Enjoy the " + type;
    }
    protected String sucessfullReturnMessage(String type){
        return "Thank you for returning the " + type;
    }

    protected   String unsucessfulCheckOutMessage(String type){
        return String.format("That %s is not available.", type);
    }
    protected   String unsucessfulReturnMessage(String type){
        return String.format("That is not a valid %s to return.", type);
    }
    protected abstract String printColumns();

    protected abstract String checkout(int id);

}