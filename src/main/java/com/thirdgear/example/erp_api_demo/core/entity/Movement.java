package com.thirdgear.example.erp_api_demo.core.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

/**
 * Represents activity, a movement between tanks, or an activity against 
 * a tank.
 */
@Entity
@Table(name="movement")
public class Movement {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	
	@OneToOne
	@JoinColumn(name = "source_movement_id", referencedColumnName = "id")
	private MovementSegment source;
	
	@OneToOne
	@JoinColumn(name = "dest_movement_id", referencedColumnName = "id")
	private MovementSegment dest;
	
	@ManyToOne()
	WorkOrder workOrder;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public MovementSegment getSource() {
		return source;
	}

	public void setSource(MovementSegment source) {
		this.source = source;
	}

	public MovementSegment getDest() {
		return dest;
	}

	public void setDest(MovementSegment dest) {
		this.dest = dest;
	}	
}
