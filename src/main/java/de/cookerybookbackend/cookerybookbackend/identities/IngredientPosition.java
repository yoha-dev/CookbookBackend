package de.cookerybookbackend.cookerybookbackend.identities;

import org.springframework.data.mongodb.core.mapping.DocumentReference;

public class IngredientPosition {

    private int position;

    private Ingredient ingredient;

    private IngredientUnit ingredientUnit;

    private Double amount;

    public int getPosition() {
        return position;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public Ingredient getIngredient() {
        return ingredient;
    }

    public void setIngredient(Ingredient ingredient) {
        this.ingredient = ingredient;
    }

    public IngredientUnit getUnit() {
        return ingredientUnit;
    }

    public void setUnit(IngredientUnit unit) {
        this.ingredientUnit = unit;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
