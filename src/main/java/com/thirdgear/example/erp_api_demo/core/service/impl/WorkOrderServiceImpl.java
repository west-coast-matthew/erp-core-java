package com.thirdgear.example.erp_api_demo.core.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrder;
import com.thirdgear.example.erp_api_demo.core.repo.WorkOrderRepository;
import com.thirdgear.example.erp_api_demo.core.service.WorkOrderService;

public class WorkOrderServiceImpl implements WorkOrderService{
	
	@Autowired 
	private WorkOrderRepository repo;

	@Override
	public Iterable<WorkOrder> getWorkOrders() {
		return repo.findAll();
	}
	
}