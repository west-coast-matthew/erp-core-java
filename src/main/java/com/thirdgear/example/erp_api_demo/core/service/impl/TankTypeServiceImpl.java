package com.thirdgear.example.erp_api_demo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.core.entity.TankType;
import com.thirdgear.example.erp_api_demo.core.repo.TankTypeRepository;
import com.thirdgear.example.erp_api_demo.core.service.TankTypeService;

public class TankTypeServiceImpl implements TankTypeService{

	@Autowired 
	private TankTypeRepository repo;
	
	@Override
	public Iterable<TankType> getTankTypes() {
		return repo.findAll();
	}
	
}