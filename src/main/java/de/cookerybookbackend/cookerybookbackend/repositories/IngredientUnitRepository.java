package de.cookerybookbackend.cookerybookbackend.repositories;

import de.cookerybookbackend.cookerybookbackend.identities.Ingredient;
import de.cookerybookbackend.cookerybookbackend.identities.IngredientUnit;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface IngredientUnitRepository extends MongoRepository<IngredientUnit, String> {

    public List<IngredientUnit> findAllBy();
    public IngredientUnit findByName(String name);

}