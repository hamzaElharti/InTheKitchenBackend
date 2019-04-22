package com.xsoft.secureapp.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.xsoft.secureapp.model.Recipe;

public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
	//public List<Recipe> findAll();
	//public Recipe findById(int id);
}
