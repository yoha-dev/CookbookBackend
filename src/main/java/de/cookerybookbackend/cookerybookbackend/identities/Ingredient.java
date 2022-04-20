package de.cookerybookbackend.cookerybookbackend.identities;

import org.springframework.data.annotation.Id;

public class Ingredient {

    @Id
    private String id;

    private String name;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
