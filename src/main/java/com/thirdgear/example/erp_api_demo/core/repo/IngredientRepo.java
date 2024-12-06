package com.thirdgear.example.erp_api_demo.core.repo;

import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.Ingredient;
import com.thirdgear.example.erp_api_demo.core.entity.Tank;

public interface IngredientRepo extends CrudRepository<Ingredient, Long>{

}
