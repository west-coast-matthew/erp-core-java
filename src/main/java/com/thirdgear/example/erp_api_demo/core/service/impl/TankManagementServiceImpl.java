package com.thirdgear.example.erp_api_demo.core.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.exception.EntityNotFoundException;
import com.thirdgear.example.erp_api_demo.core.repo.TankRepository;
import com.thirdgear.example.erp_api_demo.core.service.TankManagementService;

@Service
public class TankManagementServiceImpl implements TankManagementService{
	
	@Autowired
	private TankRepository repo;

	@Override
	public Iterable<Tank> getTanks() {
		return repo.findAll();
	}

	@Override
	public Tank createTank(Tank tank) {
		
		return repo.save(tank);
	}

	@Override
	public Tank updateTank(Tank tank) {
		
		if(!repo.existsById(tank.id)) {
			throw new EntityNotFoundException("Cannot locate tank with ID "+ tank.id);
		}
		
		Tank tankRef = repo.findById(tank.id).get();
		
		tankRef.setName(tank.getName());
		
		return repo.save(tankRef);
	}

	@Override
	public void archiveTank(long id) {
		Optional<Tank> tankRef = repo.findById(id);
		
		if(!tankRef.isPresent()) {
			throw new EntityNotFoundException("Cannot locate tank with ID "+ id);
		}
		
		Tank tank = tankRef.get();
		
		repo.save(tank);
		
	}

	@Override
	public Tank getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}