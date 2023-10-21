package ru.usikov.pizzaapp.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientDto;
import ru.usikov.pizzaapp.api.mapper.DictionaryMapper;
import ru.usikov.pizzaapp.domain.repository.IngredientRepository;

@Service
@RequiredArgsConstructor
public class DictionaryService {

    private final IngredientRepository ingredientRepository;
    private final DictionaryMapper dictionaryMapper;

    public Page<IngredientDto> getIngredientPage(Pageable pageable) {
        return ingredientRepository.findPage(pageable)
                .map(dictionaryMapper::toIngredientDto);
    }

    public IngredientDto saveOrUpdateIngredient(IngredientDto ingredientDto) {
        return dictionaryMapper.toIngredientDto(
                ingredientRepository.save(
                        dictionaryMapper.toIngredient(ingredientDto)));
    }

}
