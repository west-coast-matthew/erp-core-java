package com.wc_matthew.demo.erp.core.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * MovementSegment.java
 * 
 * Represents a side if a movement.
 * 
 */
@Entity
@Table(name="movement_segment")
public class MovementSegment extends BaseEntity{
	
	/****************************************************************************************
	* Core attributes
	****************************************************************************************/
	/**
     * Tank level prior to operation.
     */
    @Column(name="before_gallons")
    private int previousGallons;

    /**
     * Tank level after operation completion.
     */
    @Column(name="after_gallons")
    private int afterGallons;
    
	/****************************************************************************************
	* Relations
	****************************************************************************************/
	@OneToOne
	@JoinColumn(name = "tank_id", referencedColumnName = "id")
	private Tank tank;
	
	/****************************************************************************************
	* Accessors
	****************************************************************************************/ 
	public Tank getTank() {
		return tank;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}
	
	public int getPreviousGallons() {
		return previousGallons;
	}

	public void setPreviousGallons(int previousGallons) {
		this.previousGallons = previousGallons;
	}

	public int getAfterGallons() {
		return afterGallons;
	}

	public void setAfterGallons(int afterGallons) {
		this.afterGallons = afterGallons;
	}

	/****************************************************************************************
	* Convenience methods
	****************************************************************************************/ 
	public String toString() {
		return "MovementSegment: "+ this.id;
	}
}
