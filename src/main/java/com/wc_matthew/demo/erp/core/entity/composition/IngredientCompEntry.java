package com.wc_matthew.demo.erp.core.entity.composition;

import com.wc_matthew.demo.erp.core.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

@Entity
public class IngredientCompEntry extends BaseEntity{
	
	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	@NotNull(message="Value must be present for attribute 'ingredient'")
	Ingredient ingredient;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/ 

	
	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
	     return "IngredientMethodCompEntry: "+ this.id;
	}

	public Ingredient getIngredient() {
		return ingredient;
	}

	public void setIngredient(Ingredient ingredient) {
		this.ingredient = ingredient;
	}
}
