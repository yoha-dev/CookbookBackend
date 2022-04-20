package de.cookerybookbackend.cookerybookbackend.identities;

import org.springframework.data.annotation.Id;

public class IngredientUnit {

    @Id
    private String id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}