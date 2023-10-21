package ru.usikov.pizzaapp.api.dto.dictionary;

import lombok.*;
import ru.usikov.pizzaapp.domain.entity.dictionary.IngredientCategory;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class IngredientCategoryDto {
    private IngredientCategory name;
    private String description;
}
