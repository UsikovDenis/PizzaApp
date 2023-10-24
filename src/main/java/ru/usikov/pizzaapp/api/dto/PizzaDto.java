package ru.usikov.pizzaapp.api.dto;

import lombok.Getter;
import lombok.Setter;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientDto;
import ru.usikov.pizzaapp.domain.entity.PizzaSizeType;
import ru.usikov.pizzaapp.domain.entity.dictionary.Ingredient;

import java.math.BigDecimal;
import java.util.List;
import java.util.UUID;

@Getter
@Setter
public class PizzaDto {

    private UUID id;

    private String title;

    private String sizeTypeTitle;

    private BigDecimal price;

    private PizzaSizeType sizeType;

    private List<IngredientDto> ingredients;
}
