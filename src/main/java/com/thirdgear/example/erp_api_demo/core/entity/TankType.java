package com.thirdgear.example.erp_api_demo.core.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="tank-type")
public class TankType{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@NotNull(message = "Value must be present for attribute 'name'")
	@Min(1)
	@Max(50)
	private String name;
	
	@CreationTimestamp
	@Column(name="created_at")
	private Instant createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Instant updatedAt;
}