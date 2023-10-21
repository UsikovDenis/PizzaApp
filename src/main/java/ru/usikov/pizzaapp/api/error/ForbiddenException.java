package ru.usikov.pizzaapp.api.error;

import org.springframework.http.HttpStatus;

public class ForbiddenException extends ApplicationStatusException {
    public ForbiddenException(String message) {
        super(HttpStatus.FORBIDDEN, message);
    }
}
