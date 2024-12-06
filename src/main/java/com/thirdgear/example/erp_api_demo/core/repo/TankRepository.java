package com.thirdgear.example.erp_api_demo.core.repo;


import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;


public interface TankRepository extends CrudRepository<Tank, Long>{
	
}