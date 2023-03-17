package com.infybuzz.service;

import com.infybuzz.entity.Movies;
import com.infybuzz.repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MoviesService {

	@Autowired
    MoviesRepository moviesRepository;

	public Optional<Movies> getMoviesById(Long id) {
		return moviesRepository.findById(id);
	}


    public List<Movies> getAllMovies() {
        return moviesRepository.findAll();
    }
}
