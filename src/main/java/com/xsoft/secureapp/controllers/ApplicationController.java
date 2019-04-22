package com.xsoft.secureapp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xsoft.secureapp.Repository.UserRepository;
import com.xsoft.secureapp.model.Ingredient;
import com.xsoft.secureapp.model.Recipe;
import com.xsoft.secureapp.model.User;
import com.xsoft.secureapp.service.IngredientService;
import com.xsoft.secureapp.service.RecipeService;

@RestController
public class ApplicationController {
	@Autowired
	UserRepository userRepo;
	
	@Autowired
	RecipeService recipeService;
	
	@Autowired
	IngredientService ingredientService;
	
	@GetMapping("/process")
	public String process() {
		return "processing..";
	}
	
	@GetMapping("/users")
	public List<User> getAllUsers() {
		List<User> users = userRepo.findAll();
		return users;
	}
	
	@RequestMapping(value="/aoi/create/recipe", method=RequestMethod.POST)
	public Recipe createRecipe(@RequestBody Recipe recipe) {
		Recipe newRecipe = recipeService.saveRecipe(recipe);
		return newRecipe;
	}
	
	@RequestMapping(value="/api/recipes", method=RequestMethod.GET)
	public List<Recipe> getAllRecipes() {
		List<Recipe> recipes = recipeService.listRecipe();
		for(Recipe recipe:recipes) {
			System.out.println("$$$$$ "+ recipe.toString());
		}	
		return recipes;
	}
	@RequestMapping(value="/api/recipe/{id}", method=RequestMethod.GET)
	public Recipe getRecipe(@RequestBody int id) {
		Recipe recipe = recipeService.getRecipe(id);
		return recipe;
	}
	
	@RequestMapping(value="/api/ingredients", method=RequestMethod.GET)
	public List<Ingredient> getAllIngredient() {
		List<Ingredient> ingredient = ingredientService.listIngredient();
		return ingredient;
	}
	@RequestMapping(value="/api/ingredient/{id}", method=RequestMethod.GET)
	public Ingredient getIngredient(@RequestBody int id) {
		Ingredient ingredient = ingredientService.getIngredient(id);
		return ingredient;
	}

}
