package com.example.assignment1.repository;

import com.example.assignment1.entity.Movie;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

@Repository
public class MovieRepository {
    private final Map<String, Movie> movieMap = new HashMap<>();


    public MovieRepository() {
        initData();
    }

    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieMap.values());
    }


    private void initData() {
        // Sample Movie 1
        Movie movie1 = new Movie();
        movie1.setImdbId("tt123456");
        movie1.setTitle("Inception");
        movie1.setDescription("A mind-bending science fiction film.");
        movie1.setRating(8.8);
        movie1.setGenre("Science Fiction");
        movie1.setYear(2010);
        movie1.setLastModified(LocalDateTime.now());


        // Sample Movie 2
        Movie movie2 = new Movie();
        movie2.setImdbId("tt789012");
        movie2.setTitle("The Dark Knight");
        movie2.setDescription("A superhero action film featuring Batman.");
        movie2.setRating(9.0);
        movie2.setGenre("Action");
        movie2.setYear(2008);
        movie2.setLastModified(LocalDateTime.now());


        // Sample Movie 3
        Movie movie3 = new Movie();
        movie3.setImdbId("tt345678");
        movie3.setTitle("Forrest Gump");
        movie3.setDescription("A heartwarming drama about a man's life journey.");
        movie3.setRating(8.8);
        movie3.setGenre("Drama");
        movie3.setYear(1994);
        movie3.setLastModified(LocalDateTime.now());


        // Sample Movie 4
        Movie movie4 = new Movie();
        movie4.setImdbId("tt901234");
        movie4.setTitle("The Shawshank Redemption");
        movie4.setDescription("A story of hope and friendship in a prison setting.");
        movie4.setRating(9.3);
        movie4.setGenre("Drama");
        movie4.setYear(1994);
        movie4.setLastModified(LocalDateTime.now());


        // Sample Movie 5
        Movie movie5 = new Movie();
        movie5.setImdbId("tt567890");
        movie5.setTitle("Pulp Fiction");
        movie5.setDescription("A crime film with nonlinear storytelling.");
        movie5.setRating(8.9);
        movie5.setGenre("Crime");
        movie5.setYear(1994);
        movie5.setLastModified(LocalDateTime.now());


        movieMap.put(movie1.getImdbId(), movie1);
        movieMap.put(movie2.getImdbId(), movie2);
        movieMap.put(movie3.getImdbId(), movie3);
        movieMap.put(movie4.getImdbId(), movie4);
        movieMap.put(movie5.getImdbId(), movie5);

    }

    public Movie getMovie(String imdbId) {
        return movieMap.get(imdbId);
    }

    public Movie addMovie(Movie movie) {
        movieMap.put(movie.getImdbId(), movie);
        return movie;
    }

    public Movie updateMovie(String imdbId, Movie movie) {
        if(movieMap.containsKey(imdbId)) {
            movieMap.put(imdbId, movie);
            return movie;
        } else {
            return null;
        }
    }

    public void deleteMovie(String imdbId) {
        movieMap.remove(imdbId);
    }


    // Additional methods for update and delete if needed.

}