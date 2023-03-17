package com.infybuzz.controller;

import com.infybuzz.entity.Movies;
import com.infybuzz.exceptions.MovieNotFoundException;
import com.infybuzz.service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MoviesController {

    @Autowired
    MoviesService moviesService;

    @GetMapping("/movies/{id}")
    Movies getMovie(@PathVariable Long id) {
        return moviesService.getMoviesById(id).orElseThrow(()->new MovieNotFoundException(id));
    }

    @GetMapping("movies")
    List<Movies> getAllMovies() {
        return moviesService.getAllMovies();
    }
}
