package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.MappedSuperclass;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;

@MappedSuperclass
public abstract class BaseDictionaryEntity extends BaseEntity implements DictionaryEntityIF{
	
	/****************************************************************************************
     * Core attributes
     ****************************************************************************************/
	@NotNull(message = "Value must be present for attribute 'name'")
	@Min(1)
	@Max(50)
	protected String name;
	
	protected String description;
	
	protected boolean isActive = true;
	
	/****************************************************************************************
     * Accessors
     ****************************************************************************************/
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
}
