package de.cookerybookbackend.cookerybookbackend.identities;

import de.cookerybookbackend.cookerybookbackend.repositories.RecipeRepository;
import org.springframework.data.annotation.Id;

import java.time.Instant;
import java.util.List;

public class Recipe {

    @Id
    private String id;

    private Chef author;

    private Instant created;

    private Instant lastModified;

    private String title;

    private String subline;

    private String description;

    /* E.G. "Große Ikeabackform mit Deckel, 180° 30min Oberhitze" */
    private String trayAndDuration;

    private List<IngredientPosition> listings;

    public Chef getAuthor() {
        return author;
    }

    public void setAuthor(Chef author) {
        this.author = author;
    }

    public List<IngredientPosition> getListings() {
        return listings;
    }

    public void setListings(List<IngredientPosition> listings) {
        this.listings = listings;
    }


    public Instant getCreated() {
        return created;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    public Instant getLastModified() {
        return lastModified;
    }

    public void setLastModified(Instant lastModified) {
        this.lastModified = lastModified;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubline() {
        return subline;
    }

    public void setSubline(String subline) {
        this.subline = subline;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getTrayAndDuration() {
        return trayAndDuration;
    }

    public void setTrayAndDuration(String trayAndDuration) {
        this.trayAndDuration = trayAndDuration;
    }
}
