package com.wc_matthew.demo.erp.core.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;

/**
 * WorkOrder
 * 
 * Represents a request for work to be performed. This can be a single operation
 * such as 'filter pulp' from a tank of raw orange juice product base' or a series 
 * of operations such as 'move product from one tank into a series of other tanks'.
 * 
 */
@Entity
@Table(name="work-order")
public class WorkOrder extends BaseEntity{
	
	/****************************************************************************************
	* Core attributes
	****************************************************************************************/
	@Column(name="work_order_number")
	private String workOrderNumber;
	
	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	@OneToMany(cascade=CascadeType.ALL, mappedBy="workOrder")
	private List<Movement>movements = new ArrayList();
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "workOrderStatus")
	@NotNull(message="Status value must be present for 'work order status' attribute")
	@JoinColumn(name = "work_order_status_id")
	private WorkOrderStatus workOrderStatus;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/
	
	public List<Movement> getMovements() {
		return movements;
	}

	public void setMovements(List<Movement> movements) {
		this.movements = movements;
	}

	public WorkOrderStatus getWorkOrderStatus() {
		return workOrderStatus;
	}

	public void setWorkOrderStatus(WorkOrderStatus workOrderStatus) {
		this.workOrderStatus = workOrderStatus;
	}
	
	public String getWorkOrderNumber() {
		return workOrderNumber;
	}

	public void setWorkOrderNumber(String workOrderNumber) {
		this.workOrderNumber = workOrderNumber;
	}

	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	
	public String toString() {
	     return "WorkOrder: id->"+ this.id +", number: "+ workOrderNumber;
	}
	
}