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
@Table(name="tank")
public class Tank{
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;
	
	@NotNull(message = "Value must be present for attribute 'name'")
	@Min(1)
	@Max(50)
	public  String name;
	
	private boolean isActive = true;
	
	@NotNull(message="Value must be present for 'tank status' attribute")
	TankStatus tankStatus;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	public TankStatus getTankStatus() {
		return tankStatus;
	}

	public void setTankStatus(TankStatus tankStatus) {
		this.tankStatus = tankStatus;
	}

	public Instant getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Instant createdAt) {
		this.createdAt = createdAt;
	}

	public Instant getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(Instant updatedAt) {
		this.updatedAt = updatedAt;
	}



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