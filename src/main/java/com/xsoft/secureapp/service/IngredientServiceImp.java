package com.xsoft.secureapp.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xsoft.secureapp.Repository.IngredientRepository;
import com.xsoft.secureapp.model.Ingredient;

@Service
@Transactional
public class IngredientServiceImp implements IngredientService {

	@Autowired
	public IngredientRepository ingredientRepo;
	
	@Override
	public List<Ingredient> listIngredient() {
		List<Ingredient> ingredients = ingredientRepo.findAll();
		return ingredients;
	}

	@Override
	public Ingredient saveIngredient(Ingredient ingdt) {
		Ingredient ingredient = ingredientRepo.save(ingdt);
		return ingredient;
	}

	@Override
	public Ingredient getIngredient(int id) {
		Ingredient ingredient = ingredientRepo.getOne(id);
		return ingredient;
	}

}
