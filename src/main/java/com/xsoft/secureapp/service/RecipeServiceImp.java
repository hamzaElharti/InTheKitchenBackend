package com.xsoft.secureapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsoft.secureapp.Repository.RecipeRepository;
import com.xsoft.secureapp.model.Recipe;

@Service
@Transactional
public class RecipeServiceImp implements RecipeService {
	@Autowired
	public RecipeRepository recipeRepo;

	@Override
	public List<Recipe> listRecipe() {
		List<Recipe> recipes = recipeRepo.findAll();
		return recipes;
	}

	@Override
	public Recipe getRecipe(int id) {
		Recipe recipe = recipeRepo.getOne(id);
		return recipe;
	}

	@Override
	public Recipe saveRecipe(Recipe r) {
		Recipe recipe = recipeRepo.save(r);
		return recipe;
	}
	

}
