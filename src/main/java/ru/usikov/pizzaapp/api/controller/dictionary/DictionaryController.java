package ru.usikov.pizzaapp.api.controller.dictionary;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;
import ru.usikov.pizzaapp.api.dto.dictionary.IngredientDto;
import ru.usikov.pizzaapp.service.DictionaryService;

@RestController
@RequestMapping("/dictionary")
@RequiredArgsConstructor
public class DictionaryController {

    private final DictionaryService dictionaryService;

    @GetMapping("/ingredient/{page}/{size}")
    public Page<IngredientDto> getIngredientPage(@PathVariable int page, @PathVariable int size) {
        return dictionaryService.getIngredientPage(PageRequest.of(page, size));
    }

    @PostMapping("/ingredient")
    public IngredientDto saveIngredient(@RequestBody IngredientDto ingredientDto){
        ingredientDto.setId(null);
        return dictionaryService.saveOrUpdateIngredient(ingredientDto);
    }

}
