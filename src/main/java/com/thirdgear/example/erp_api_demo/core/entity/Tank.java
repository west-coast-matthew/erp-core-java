package com.thirdgear.example.erp_api_demo.core.entity;

import java.time.Instant;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;


@Entity
@Table(name="tank")
public class Tank{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
	
	public  String name;
	
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

	public void setName(String name) {
		this.name = name;
	}



	public String toString() {
    	return "Tank: "+ this.name;
    }
}