package com.wc_matthew.demo.erp.core.entity.composition;

import com.wc_matthew.demo.erp.core.entity.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotNull;

@Entity

public class VarietalCompEntry extends BaseEntity {
	
	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	@NotNull(message="Value must be present for attribute 'varietal'")
	Varietal varietal;

	/****************************************************************************************
	* Accessors
	****************************************************************************************/ 

	public Varietal getVarietal() {
		return varietal;
	}

	public void setVarietal(Varietal varietal) {
		this.varietal = varietal;
	}
	
	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
	     return "VarietalMethodCompEntry: "+ this.id;
	}
	
}
