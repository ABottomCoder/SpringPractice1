package com.example.SpringPractice1.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.ZonedDateTime;


// private final, getter, public constructor, equals, hashcode, to string
public record ApiException(String message, Throwable throwable, HttpStatus httpStatus, ZonedDateTime timestamp) {
}
