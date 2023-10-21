package ru.usikov.pizzaapp.api.dto.dictionary;

import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Setter
public class IngredientDto {

    private UUID id;

    private String name;

    private int mass;

    private BigDecimal price;

    private IngredientCategoryDto category;
}
