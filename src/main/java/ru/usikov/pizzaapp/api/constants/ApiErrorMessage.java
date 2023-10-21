package ru.usikov.pizzaapp.api.constants;


import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ApiErrorMessage {

    public static final String NOT_FOUND_USER = "Такой пользователь не найден";
    public static final String FORBIDDEN = "У вас нет доступа";

}
