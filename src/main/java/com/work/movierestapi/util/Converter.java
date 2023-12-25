package com.work.movierestapi.util;

import com.work.movierestapi.dto.ActorResponse;
import com.work.movierestapi.entity.Actor;

import java.util.ArrayList;
import java.util.List;

public class Converter {
    public static List<ActorResponse> actorResponsesConvertor(List<Actor> allactors){
        List<ActorResponse> actors = new ArrayList<>();

        for(Actor actor: allactors){
            actors.add(new ActorResponse(actor.getId(),actor.getFirstName(),actor.getLastNAme(),actor.getBirthDate()));
        }
        return actors;
    }
    public static ActorResponse actorResponsesConvertor(Actor actor){
        return new ActorResponse(actor.getId(),actor.getFirstName(),actor.getLastNAme(),actor.getBirthDate());
    }
}
