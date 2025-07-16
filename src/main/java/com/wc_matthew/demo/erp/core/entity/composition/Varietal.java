package com.wc_matthew.demo.erp.core.entity.composition;

import com.wc_matthew.demo.erp.core.entity.BaseDictionaryEntity;

import jakarta.persistence.Entity;

@Entity
public class Varietal extends BaseDictionaryEntity{


	public String toString() {
		return "Varietal: "+ this.id;
	}
	
}
