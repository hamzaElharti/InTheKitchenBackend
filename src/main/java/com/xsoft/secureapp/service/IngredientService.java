package com.xsoft.secureapp.service;

import java.util.List;

import com.xsoft.secureapp.model.Ingredient;
import com.xsoft.secureapp.model.Recipe;

public interface IngredientService {
	public List<Ingredient> listIngredient();
	public Ingredient saveIngredient(Ingredient ingredient);
	public Ingredient getIngredient(int id);
	
}
