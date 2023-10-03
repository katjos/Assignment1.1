package com.example.assignment1.service;

import com.example.assignment1.entity.Movie;
import com.example.assignment1.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    private final List<Movie> movies = new ArrayList<>();
    public List<Movie> getAllMovies;

    public List<Movie> getAllMovies() {
        return movies;
    }

    public Movie addMovie(Movie movie) {
        movie.setLastModified(LocalDateTime.now());
        movies.add(movie);
        return movie;
    }
}
