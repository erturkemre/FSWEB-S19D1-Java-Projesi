package com.work.movierestapi.service;


import com.work.movierestapi.entity.Actor;
import com.work.movierestapi.entity.Movie;

import java.util.List;

public interface MovieService {
    Movie save(Movie movie);
    List<Movie> findAll();
    Movie findById(long id);
    Movie delete(long id);
}
