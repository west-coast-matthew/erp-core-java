package com.thirdgear.example.erp_api_demo.core.service;
import java.util.List;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;

@Service
public interface TankManagementService{
	
	public Iterable<Tank>getTanks();
	
	/**
	 * 
	 * @param tank
	 * @return
	 */
	public Tank createTank(Tank tank);
	
	/**
	 * 
	 */
	public Tank updateTank(Tank tank);
	
	/**
	 * 
	 */
	public void archiveTank(long id);
	
	/**
	 * 
	 * @param id
	 * @return
	 */
	public Tank getById(int id);
	
}