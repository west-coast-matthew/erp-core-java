package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Represents an individual operation which a work order consists of. Every work 
 * order has at least movement, may may consist of many.
 */
@Entity
@Table(name="movement")
public class Movement extends BaseEntity{
	
	/****************************************************************************************
	* Core attributes
	****************************************************************************************/
	
	/**
     * Number of gallons requested by the user, this might actually vary from the end resulting 
     * gallons.
     */
	@Column(name="requested_gallons")
	private int requestedGallons;
	
	/****************************************************************************************
	* Relations
	****************************************************************************************/ 
	@OneToOne
	@JoinColumn(name = "source_movement_id", referencedColumnName = "id")
	private MovementSegment source;
	
	@OneToOne
	@JoinColumn(name = "dest_movement_id", referencedColumnName = "id")
	private MovementSegment dest;
	
	@ManyToOne()
	WorkOrder workOrder;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/ 
	public void setSource(MovementSegment source) {
		this.source = source;
	}

	public MovementSegment getDest() {
		return dest;
	}

	public void setDest(MovementSegment dest) {
		this.dest = dest;
	}	
	
	public int getRequestedGallons() {
		return requestedGallons;
	}

	public void setRequestedGallons(int requestedGallons) {
		this.requestedGallons = requestedGallons;
	}

	public WorkOrder getWorkOrder() {
		return workOrder;
	}

	public void setWorkOrder(WorkOrder workOrder) {
		this.workOrder = workOrder;
	}

	public MovementSegment getSource() {
		return source;
	}

	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	/**
     * Convenience method for determining if a movement actually involves a physical transfer 
     * of content between two points. For some operations, such as pasurization or a subsequent 
     * cooling operation, the content remains in the same physical container. A common check 
     * while applying business logic is determine if there was aphysical transfer, so we provide
     * this convenience method here, and encapsulate/centralize the logic here.
     * 
     * @returns 
     */
    public boolean isActualMovement(){
        return this.source.getTank().id == this.dest.getTank().id;
    }
    
	public String toString() {
	     return "Movement: "+ this.id;
	}
}
