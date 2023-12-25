package com.work.movierestapi.service;

import com.work.movierestapi.entity.Actor;
import com.work.movierestapi.exceptions.ApiException;
import com.work.movierestapi.repository.ActorRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ActorServiceImpl implements ActorService{

    private final ActorRepository actorRepository;

    @Override
    public List<Actor> findAll() {
        return actorRepository.findAll();
    }

    @Override
    public Actor findById(long id) {
        Optional<Actor> actor = actorRepository.findById(id);
        if(actor.isPresent()){
            return actor.get();
        }
        throw new ApiException("actor is not fount with id: "+id, HttpStatus.NOT_FOUND);
    }

    @Override
    public Actor save(Actor actor) {
        return actorRepository.save(actor);
    }

    @Override
    public Actor delete(long id) {
        Actor findActor = findById(id);
        actorRepository.delete(findActor);
        return findActor;
    }
}
