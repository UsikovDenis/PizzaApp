package ru.usikov.pizzaapp.api.mapper;

import org.mapstruct.DecoratedWith;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientDto;
import ru.usikov.pizzaapp.api.mapper.decorators.DictionaryMapperDecorator;
import ru.usikov.pizzaapp.domain.entity.dictionary.Ingredient;

@Mapper
@DecoratedWith(DictionaryMapperDecorator.class)
public interface DictionaryMapper {

    @Mapping(target = "category", ignore = true)
    IngredientDto toIngredientDto(Ingredient ingredient);

    @Mapping(target = "category", ignore = true)
    Ingredient toIngredient(IngredientDto ingredientDto);

}
