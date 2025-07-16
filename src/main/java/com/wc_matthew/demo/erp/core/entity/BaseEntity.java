package com.wc_matthew.demo.erp.core.entity;

import java.time.Instant;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class BaseEntity implements DictionaryEntityIF{

	/****************************************************************************************
     * Core attributes
     ****************************************************************************************/
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected Long id;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@CreationTimestamp
	@Column(name="created_at")
	private Instant createdAt;
	
	@UpdateTimestamp
	@Column(name="updated_at")
	private Instant updatedAt;
	
	/****************************************************************************************
     * Accessors
     ****************************************************************************************/
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
	
}
