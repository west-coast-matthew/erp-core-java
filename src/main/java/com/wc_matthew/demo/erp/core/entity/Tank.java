package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;


@Entity
@Table(name="tank")
public class Tank extends BaseDictionaryEntity{
	
	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	
	@NotNull(message="Value must be present for 'tank status' attribute")
	TankStatus tankStatus;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/
	
	public TankStatus getTankStatus() {
		return tankStatus;
	}

	public void setTankStatus(TankStatus tankStatus) {
		this.tankStatus = tankStatus;
	}

	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
    	return "Tank: "+ this.name;
    }
}