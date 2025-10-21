package com.appdev.citrecipesharing.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.appdev.citrecipesharing.entity.RecipeEntity;
import com.appdev.citrecipesharing.repository.RecipeRepository;

@Service
public class RecipeService {

    @Autowired
    private RecipeRepository recipeRepository;

    // Create (C)
    public RecipeEntity addRecipe(RecipeEntity recipe) {
        return recipeRepository.save(recipe);
    }

    // Read (R)
    public List<RecipeEntity> getAllRecipes() {
        return recipeRepository.findAll();
    }

    // Update (U)
    public RecipeEntity updateRecipe(int id, RecipeEntity recipeDetails) {
        RecipeEntity existingRecipe = recipeRepository.findById(id).orElse(null);

        if (existingRecipe != null) {
            existingRecipe.setTitle(recipeDetails.getTitle());
            existingRecipe.setDescription(recipeDetails.getDescription());
            existingRecipe.setIngredients(recipeDetails.getIngredients());
            existingRecipe.setInstruction(recipeDetails.getInstruction());
            existingRecipe.setCooktime(recipeDetails.getCooktime());
            existingRecipe.setCuisine(recipeDetails.getCuisine());
            existingRecipe.setCategory(recipeDetails.getCategory());
            return recipeRepository.save(existingRecipe);
        } else {
            return null;
        }
    }

    // Delete (D)
    public String deleteRecipe(int id) {
        if (recipeRepository.existsById(id)) {
            recipeRepository.deleteById(id);
            return "Recipe with ID " + id + " has been deleted.";
        } else {
            return "Recipe with ID " + id + " not found.";
        }
    }
}
