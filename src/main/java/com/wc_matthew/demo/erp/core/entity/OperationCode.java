
package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="operation_code")
public class OperationCode extends BaseDictionaryEntity{
	
	public String toString() {
		return "OperationCode: "+ this.id;
	}
	
}