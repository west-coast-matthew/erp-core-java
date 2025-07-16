package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name="tank_status")
public class TankStatus extends BaseDictionaryEntity{
	
	public String toString() {
		return "TankStatus: "+ this.id;
	}
}