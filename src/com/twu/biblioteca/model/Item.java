package com.twu.biblioteca.model;

public abstract class Item {

    private int id, publishingYear;
    private boolean available;
    private String title;

    protected Item(int id, int publishingYear, boolean available, String title) {
        this.id = id;
        this.publishingYear = publishingYear;
        this.available = available;
        this.title = title;
    }

    protected Item(boolean available){
        this.available = available;
    }


    public String getTitle() {

        return title;
    }

    public int getId() {
        return id;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public boolean isAvailable() {

        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public abstract String getDetails();
}
