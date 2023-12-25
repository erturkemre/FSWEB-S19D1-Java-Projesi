package com.work.movierestapi.controller;

import com.work.movierestapi.dto.ActorResponse;
import com.work.movierestapi.entity.Actor;
import com.work.movierestapi.service.ActorService;
import com.work.movierestapi.service.ActorServiceImpl;
import com.work.movierestapi.util.Converter;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Slf4j
@RestController
@RequestMapping("/actor")
public class ActorController {
    private final ActorService actorService;

    @GetMapping
    public List<ActorResponse> findAll(){
        List<Actor> allactors = actorService.findAll();
        return Converter.actorResponsesConvertor(allactors);
    }
    @GetMapping("/{id}")
    public ActorResponse findById(@PathVariable  long id){
        Actor actor =  actorService.findById(id);
        return Converter.actorResponsesConvertor(actor);
    }
}
