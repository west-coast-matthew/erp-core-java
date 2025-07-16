package com.wc_matthew.demo.erp.core.entity.composition;

import com.wc_matthew.demo.erp.core.entity.BaseEntity;

import jakarta.validation.constraints.NotNull;

public class HarvestMethodCompEntry extends BaseEntity{

	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	@NotNull(message="Value must be present for attribute 'harvest method'")
	HarvestMethod harvestMethod;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/ 
	public HarvestMethod getHarvestMethod() {
		return harvestMethod;
	}

	public void setHarvestMethod(HarvestMethod harvestMethod) {
		this.harvestMethod = harvestMethod;
	}
	
	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
	     return "HarvestMethodCompEntry: "+ this.id;
	}

}
