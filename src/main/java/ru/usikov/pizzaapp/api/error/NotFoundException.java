package ru.usikov.pizzaapp.api.error;

import org.springframework.http.HttpStatus;



public class NotFoundException extends ApplicationStatusException{
    public NotFoundException(String message) {
        super(HttpStatus.NOT_FOUND, message);
    }
}


