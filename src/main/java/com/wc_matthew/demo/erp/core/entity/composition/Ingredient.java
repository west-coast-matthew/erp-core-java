package com.wc_matthew.demo.erp.core.entity.composition;

import com.wc_matthew.demo.erp.core.entity.BaseDictionaryEntity;

import jakarta.persistence.Entity;

@Entity
public class Ingredient extends BaseDictionaryEntity{

	public String toString() {
	     return "Ingredient: "+ this.id;
	}	
}
