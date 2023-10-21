package ru.usikov.pizzaapp.api.error;

import org.springframework.http.HttpStatus;

public class UnprocessableEntityException extends ApplicationStatusException{
    public UnprocessableEntityException(String message) {
        super(HttpStatus.UNPROCESSABLE_ENTITY, message);
    }
}
