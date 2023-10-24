package ru.usikov.pizzaapp.domain.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.UuidGenerator;
import ru.usikov.pizzaapp.domain.entity.dictionary.Ingredient;

import java.math.BigDecimal;
import java.text.Bidi;
import java.util.List;
import java.util.UUID;

@Entity
@Table(name = "pizza")
@Getter
@Setter
public class Pizza {

    @Id
    @UuidGenerator
    @GeneratedValue
    private UUID id;

    private String title;

    @Column(name = "size_type")
    @Enumerated(EnumType.STRING)
    private PizzaSizeType sizeType;

    @ManyToMany
    private List<Ingredient> ingredients;

    public BigDecimal getPrice() {
        BigDecimal ingredientPrice = ingredients.stream()
                .map(Ingredient::getPrice)
                .reduce(BigDecimal::add)
                .orElse(BigDecimal.ZERO);
        return ingredientPrice.add(sizeType.getBasePrice());
    }
}
