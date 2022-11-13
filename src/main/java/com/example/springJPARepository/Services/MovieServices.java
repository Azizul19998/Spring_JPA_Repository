package com.example.springJPARepository.Services;

import com.example.springJPARepository.Models.Movie;
import com.example.springJPARepository.Repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MovieServices {
    @Autowired
    MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }
    public void createMovie(Movie movie) {

        movieRepository.save(movie);
    }
}
