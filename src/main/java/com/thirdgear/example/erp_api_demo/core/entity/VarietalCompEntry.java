package com.thirdgear.example.erp_api_demo.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class VarietalCompEntry {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
}
