package com.thirdgear.example.erp_api_demo.core.entity;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@Entity
public class Varietal {

	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull(message = "Value must be present for attribute 'name'")
	@Min(1)
	@Max(50)
	private String name;
	
	private boolean isActive = true;
	
	@CreationTimestamp
	@Column(name="created_at")
	public Instant createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	public Instant updatedAt;
	
	public String getName() {
		return name;
	}
	
	
}
