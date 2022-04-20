package de.cookerybookbackend.cookerybookbackend.repositories;

import de.cookerybookbackend.cookerybookbackend.identities.Ingredient;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IngredientRepository extends MongoRepository<Ingredient, String> {

    public List<Ingredient> findAllBy();
    public Ingredient findByName(String name);
    public List<Ingredient> findByColor(String color);

}