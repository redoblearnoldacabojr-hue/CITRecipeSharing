package com.appdev.citrecipesharing.controller;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;
import java.util.List;

import com.appdev.citrecipesharing.entity.RecipeEntity;
import com.appdev.citrecipesharing.service.RecipeService;

@RestController
@RequestMapping("/api/recipes")
public class RecipeController {

    @Autowired
    private RecipeService recipeService;

    @GetMapping("/print")
    public String print() {
        return "Hello, Arnold Redoble Jr!";
    }

    // Create (C)
    @PostMapping("/postreciperecord")
    public RecipeEntity postRecipeRecord(@RequestBody RecipeEntity recipe) {
        return recipeService.addRecipe(recipe);
    }

    // Read (R)
    @GetMapping("/getallrecipes")
    public List<RecipeEntity> getAllRecipes() {
        return recipeService.getAllRecipes();
    }

    // Update (U)
    @PutMapping("/updaterecipe/{id}")
    public RecipeEntity updateRecipe(@PathVariable int id, @RequestBody RecipeEntity recipe) {
        return recipeService.updateRecipe(id, recipe);
    }

    // Delete (D)
    @DeleteMapping("/deleterecipe/{id}")
    public String deleteRecipe(@PathVariable int id) {
        return recipeService.deleteRecipe(id);
    }
}
