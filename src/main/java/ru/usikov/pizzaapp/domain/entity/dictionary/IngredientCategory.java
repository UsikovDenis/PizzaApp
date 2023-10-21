package ru.usikov.pizzaapp.domain.entity.dictionary;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Arrays;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum IngredientCategory {
    NONE("Без категории"),
    PROTEIN("Мясо"),
    VEGETABLE("Овощ"),
    FRUIT("Фрукт"),
    DAIRY("Молочный"),
    MUSHROOM("Гриб"),
    SAUCE("Соус");

    private final String description;

    public static IngredientCategory of(String name) {
        return Arrays.stream(IngredientCategory.values())
                .filter(ingredientCategory -> ingredientCategory.name().equals(name))
                .findFirst().orElse(NONE);
    }
}
