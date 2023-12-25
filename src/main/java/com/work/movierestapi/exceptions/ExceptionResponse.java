package com.work.movierestapi.exceptions;

import lombok.AllArgsConstructor;
import lombok.ToString;
import java.time.LocalDateTime;

@ToString
@AllArgsConstructor
public class ExceptionResponse {
    private Integer status;
    private String message;
    private LocalDateTime dateTime;
}
