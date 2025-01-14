package com.thirdgear.example.erp_api_demo.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;

@Entity

public class VarietalCompEntry {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull(message="Value must be present for attribute varietal")
	Varietal varietal;

	public Varietal getVarietal() {
		return varietal;
	}

	public void setVarietal(Varietal varietal) {
		this.varietal = varietal;
	}
	
}
