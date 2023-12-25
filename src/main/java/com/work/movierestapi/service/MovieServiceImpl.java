package com.work.movierestapi.service;


import com.work.movierestapi.entity.Movie;

import com.work.movierestapi.exceptions.ApiException;
import com.work.movierestapi.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieServiceImpl implements MovieService{

    private MovieRepository movieRepository;

    @Autowired
    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie save(Movie movie) {
        return movieRepository.save(movie);
    }

    @Override
    public List<Movie> findAll() {
        return movieRepository.findAll();
    }

    @Override
    public Movie findById(long id) {
        Optional<Movie> movie = movieRepository.findById(id);
        if(movie.isPresent()){
            return movie.get();
        }
        throw new ApiException("actor is not fount with id: "+id, HttpStatus.NOT_FOUND);
    }

    @Override
    public Movie delete(long id) {
        Movie findMovie = findById(id);
        movieRepository.delete(findMovie);
        return findMovie;
    }
}
