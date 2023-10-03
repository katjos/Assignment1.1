package com.example.assignment1.entity;

import java.time.LocalDateTime;


public class Movie {
    private String imdbId; // Key
    private String title;  // Required
    private String description; // Optional
    private double rating; // out of 10
    private String genre;
    private int year;
    private LocalDateTime lastModified; // timestamp in

    // Constructors, getters, and setters
    public Movie() {
    }

    public Movie(String imdbId, String title, String description, double rating, String genre, int year, LocalDateTime lastModified) {
        this.imdbId = imdbId;
        this.title = title;
        this.description = description;
        this.rating = rating;
        this.genre = genre;
        this.year = year;
        this.lastModified = lastModified;
    }

    public String getImdbId() {
        return imdbId;
    }

    public void setImdbId(String imdbId) {
        this.imdbId = imdbId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "imdbId='" + imdbId + '\'' +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", rating='" + rating + '\'' +
                ", genre='" + genre + '\'' +
                ", year='" + year + '\'' +
                ", lastModified='" + lastModified + '}';
    }
}
