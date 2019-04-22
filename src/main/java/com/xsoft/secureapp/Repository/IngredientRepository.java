package com.xsoft.secureapp.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsoft.secureapp.model.Ingredient;
import com.xsoft.secureapp.model.Recipe;

public interface IngredientRepository extends JpaRepository<Ingredient, Integer> {
	//public List<Ingredient> findAll();
	//public Ingredient findById(int id);
	//public List<Ingredient> findByRecipe(Recipe recipe);
}
