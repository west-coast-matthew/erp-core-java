package com.thirdgear.example.erp_api_demo.core.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrder;

@Service
public interface WorkOrderService{
	
	public Iterable<WorkOrder>getWorkOrders();
	
}