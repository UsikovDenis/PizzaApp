package ru.usikov.pizzaapp.api.error;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.http.HttpStatus;

@Getter
@Setter
@RequiredArgsConstructor
public class ApplicationStatusException extends RuntimeException{

    private final int code;
    private final String message;

    public ApplicationStatusException(final HttpStatus httpStatus, final String message) {
        this(httpStatus.value(),message);
    }
}
