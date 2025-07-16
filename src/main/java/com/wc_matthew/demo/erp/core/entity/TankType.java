package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="tank_type")
public class TankType extends BaseDictionaryEntity{
	
	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
		return "TankType"+ this.id;
	}
}