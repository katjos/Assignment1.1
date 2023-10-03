package com.example.assignment1.controller;

import com.example.assignment1.entity.Movie;
import com.example.assignment1.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    @GetMapping(produces = MediaType.TEXT_PLAIN_VALUE)
    public String getAllMovies() {
        List<Movie> movies = movieService.getAllMovies();  // Fixed: made it a method call
        StringBuilder response = new StringBuilder();
        for (Movie movie : movies) {
            response.append(movie.getImdbId()).append(" - ").append(movie.getTitle()).append("\n");
        }
        return response.toString();
    }

    @PostMapping
    public Movie addMovie(@RequestBody Movie movie) { // Fixed: corrected annotation position
        return movieService.addMovie(movie);
    }
}
