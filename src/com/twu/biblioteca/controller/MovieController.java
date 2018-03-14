package com.twu.biblioteca.controller;

import com.twu.biblioteca.model.Movie;

import java.util.ArrayList;

public class MovieController extends ItemController {
    ArrayList<Movie> movies = new ArrayList<>();

    public MovieController() {
        generatePreExistingMoviesList();
    }

    @Override
    public String listAvailable(){
        StringBuffer availableMovies = new StringBuffer();

        for(Movie movie : movies){
            if(movie.isAvailable())
                availableMovies.append(movie.getDetails());
        }
        return generateHead() + availableMovies.toString();
    }



    @Override
    protected String printColumns() {
        return  "Name       |Director       | Publishing Year      | Rating\n";
    }

    @Override
    public String checkout(int id) {
        Movie movieToCheckout = movies.stream()
                .filter(b -> b.getId() == id && b.isAvailable())
                .findFirst().orElse(new Movie(false));

        return movieToCheckout.isAvailable() ?  checkout(movieToCheckout) : unsucessfulCheckOutMessage("movie");

    }

    private void generatePreExistingMoviesList(){
        movies.add(new Movie(1, 1996, true, "Movie 1", 5, "Director 1"));
        movies.add(new Movie(2, 1948, true, "Movie 2", 9, "Director 2"));
        movies.add(new Movie(3, 2008, true, "Movie 3", 10, "Director 3"));
    }
    private String checkout(Movie movie){
        movie.setAvailable(false);
        return sucessfullCheckOutMessage("movie");
    }
}
