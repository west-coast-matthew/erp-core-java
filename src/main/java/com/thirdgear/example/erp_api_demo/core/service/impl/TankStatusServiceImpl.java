package com.thirdgear.example.erp_api_demo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.core.entity.TankStatus;
import com.thirdgear.example.erp_api_demo.core.repo.TankStatusRepository;
import com.thirdgear.example.erp_api_demo.core.service.TankStatusService;

public class TankStatusServiceImpl implements TankStatusService{
	
	@Autowired
	private TankStatusRepository repo;

	@Override
	public Iterable<TankStatus> getTankStatuses() {
		return repo.findAll();
	}
	
}