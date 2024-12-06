package com.thirdgear.example.erp_api_demo.core.repo;


import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.TankType;


public interface TankTypeRepository extends CrudRepository<TankType, Long>{
	
}