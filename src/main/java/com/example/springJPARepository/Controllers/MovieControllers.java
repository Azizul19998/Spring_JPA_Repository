package com.example.springJPARepository.Controllers;

import com.example.springJPARepository.Models.Movie;
import com.example.springJPARepository.Services.MovieServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MovieControllers {

    @Autowired
    MovieServices movieServices;

    @GetMapping("/get_movies")
    List<Movie> getAllMovies() {
        return movieServices.getAllMovies();
    }

    @PostMapping("/create_movie")
    public void createMovie(@RequestBody Movie movie) {
        movieServices.createMovie(movie);
    }
}
//