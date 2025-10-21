package com.appdev.citrecipesharing.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.appdev.citrecipesharing.entity.RecipeEntity;

@Repository
public interface RecipeRepository extends JpaRepository<RecipeEntity, Integer> {
    public RecipeEntity findByTitle(String title);
}
