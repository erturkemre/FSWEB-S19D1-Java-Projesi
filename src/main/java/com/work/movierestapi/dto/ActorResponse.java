package com.work.movierestapi.dto;

import java.time.LocalDate;

public record ActorResponse(long id, String firstName,String lastName, LocalDate birthDate) {
}
