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

    @Autowired
    private MovieRepository movieRepository;

    public List<Movie> getAllMovies() {
        return movieRepository.getAllMovies();
    }

    public Movie addMovie(Movie movie) {
        movie.setLastModified(LocalDateTime.now());
        return movieRepository.addMovie(movie);
    }
}
