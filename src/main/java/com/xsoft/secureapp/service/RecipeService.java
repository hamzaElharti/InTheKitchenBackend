package com.xsoft.secureapp.service;

import java.util.List;

import com.xsoft.secureapp.model.Recipe;

public interface RecipeService {
	public List<Recipe> listRecipe();
	public Recipe getRecipe(int id);
	public Recipe saveRecipe(Recipe recipe);
}
