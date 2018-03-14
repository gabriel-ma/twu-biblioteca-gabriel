package com.twu.biblioteca.model;

public class Movie extends Item{
    private int rating;
    private String director;
    public Movie(int id, int publisinhgYear, boolean available, String title, int rating, String director) {
        super(id, publisinhgYear, available, title);
        this.rating = rating;
        this.director = director;
    }
    public Movie(boolean available) {
        super(available);
    }
    public String getDirector() {
        return director;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getRating() {

        return rating;
    }

    @Override
    public String getDetails() {
         return String.format("%s     |%s      |%s      |%s%n", this.getTitle(), this.getDirector(), this.getPublishingYear(), this.getRating());
    }
}

