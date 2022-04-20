package de.cookerybookbackend.cookerybookbackend.repositories;

import de.cookerybookbackend.cookerybookbackend.identities.Recipe;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.repository.query.Param;

public interface RecipeRepository extends MongoRepository<Recipe, String> {
    public Recipe findByTitle(@Param("title") String title);
}