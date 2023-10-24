package ru.usikov.pizzaapp.domain.entity;


import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.math.BigDecimal;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum PizzaSizeType {

    LARGE("Большая (35см)",BigDecimal.valueOf(200)),
    MEDIUM("Средняя (30см)",BigDecimal.valueOf(150)),
    SMALL("Маленькая (25см)",BigDecimal.valueOf(100));

    private final String description;
    private final BigDecimal basePrice;
}
