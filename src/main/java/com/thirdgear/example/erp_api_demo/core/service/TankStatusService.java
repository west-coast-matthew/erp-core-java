package com.thirdgear.example.erp_api_demo.core.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.TankStatus;


public interface TankStatusService{
	
	public Iterable<TankStatus>getTankStatuses();
		
}