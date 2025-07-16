package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name="work_order_status")
public class WorkOrderStatus extends BaseDictionaryEntity{
			
	public String toString() {
	     return "WorkOrderStatus: "+ this.id;
	}
}