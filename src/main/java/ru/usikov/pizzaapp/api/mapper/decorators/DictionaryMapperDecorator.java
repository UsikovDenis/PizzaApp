package ru.usikov.pizzaapp.api.mapper.decorators;

import org.springframework.beans.factory.annotation.Autowired;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientCategoryDto;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientDto;
import ru.usikov.pizzaapp.api.mapper.DictionaryMapper;
import ru.usikov.pizzaapp.domain.entity.dictionary.Ingredient;
import ru.usikov.pizzaapp.domain.entity.dictionary.IngredientCategory;

public abstract class DictionaryMapperDecorator implements DictionaryMapper {

    @Autowired
    private DictionaryMapper delegate;

    @Override
    public IngredientDto toIngredientDto(Ingredient ingredient) {
        IngredientDto ingredientDto = delegate.toIngredientDto(ingredient);
        IngredientCategoryDto ingredientCategoryDto = new IngredientCategoryDto();
        ingredientCategoryDto.setName(ingredient.getCategory());
        ingredientCategoryDto.setDescription(ingredient.getCategory().getDescription());
        ingredientDto.setCategory(ingredientCategoryDto);
        return ingredientDto;
    }

    @Override
    public Ingredient toIngredient(IngredientDto ingredientDto) {
        Ingredient ingredient = delegate.toIngredient(ingredientDto);
        ingredient.setCategory(ingredientDto.getCategory().getName());
        return ingredient;
    }
}
