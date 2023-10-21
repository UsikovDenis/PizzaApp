package ru.usikov.pizzaapp.domain.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.usikov.pizzaapp.domain.entity.dictionary.Ingredient;

import java.util.UUID;

@Repository
public interface IngredientRepository extends JpaRepository<Ingredient, UUID> {
    @Query("from Ingredient")
    Page<Ingredient> findPage(Pageable pageable);
}
