package ru.usikov.pizzaapp.api.error;

import org.springframework.http.HttpStatus;

public class BadRequestException extends ApplicationStatusException{
    public BadRequestException(String message) {
        super(HttpStatus.BAD_REQUEST, message);
    }
}
