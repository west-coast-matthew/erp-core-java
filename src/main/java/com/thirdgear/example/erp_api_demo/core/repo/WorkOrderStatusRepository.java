package com.thirdgear.example.erp_api_demo.core.repo;


import org.springframework.data.repository.CrudRepository;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrderStatus;


public interface WorkOrderStatusRepository extends CrudRepository<WorkOrderStatus, Long>{
	
}