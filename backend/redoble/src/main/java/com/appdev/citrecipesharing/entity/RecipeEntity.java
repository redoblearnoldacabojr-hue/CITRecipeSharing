package com.appdev.citrecipesharing.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "recipes")
public class RecipeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private String description;
    private String ingredients;
    private String instruction;
    private int cooktime;
    private String cuisine;  // fixed typo: 'cusine' → 'cuisine'
    private String category;

    public RecipeEntity() {
        // default constructor required by JPA
    }

    public RecipeEntity(int id, String title, String description, String ingredients, 
                        String instruction, int cooktime, String cuisine, String category) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.ingredients = ingredients;
        this.instruction = instruction;
        this.cooktime = cooktime;
        this.cuisine = cuisine;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getIngredients() {
        return ingredients;
    }

    public String getInstruction() {
        return instruction;
    }

    public int getCooktime() {
        return cooktime;
    }

    public String getCuisine() {
        return cuisine;
    }

    public String getCategory() {
        return category;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setIngredients(String ingredients) {
        this.ingredients = ingredients;
    }

    public void setInstruction(String instruction) {
        this.instruction = instruction;
    }

    public void setCooktime(int cooktime) {
        this.cooktime = cooktime;
    }

    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
