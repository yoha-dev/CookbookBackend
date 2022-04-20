package de.cookerybookbackend.cookerybookbackend.controller;

import de.cookerybookbackend.cookerybookbackend.repositories.IngredientRepository;
import de.cookerybookbackend.cookerybookbackend.repositories.IngredientUnitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigController {

    final IngredientRepository ingredientRepository;

    final IngredientUnitRepository ingredientUnitRepository;

    @Autowired
    public ConfigController(IngredientRepository ingredientRepository, IngredientUnitRepository ingredientUnitRepository) {
        this.ingredientRepository = ingredientRepository;
        this.ingredientUnitRepository = ingredientUnitRepository;
    }

    @GetMapping("/config")
    public Object[] getConfig() {
        return new Object[]{ingredientRepository.findAll(), ingredientUnitRepository.findAll() };
    }
}
