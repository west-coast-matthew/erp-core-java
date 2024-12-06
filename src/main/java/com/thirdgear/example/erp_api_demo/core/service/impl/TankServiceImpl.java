package com.thirdgear.example.erp_api_demo.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.repo.TankRepository;
import com.thirdgear.example.erp_api_demo.core.service.TankService;

@Service("/tank")
public class TankServiceImpl implements TankService{

	@Autowired
	TankRepository tankRepo;
	
	/**
	 * 
	 * @return
	 */
	public Iterable<Tank>getTanks(){
		return tankRepo.findAll();
	}
	
}
