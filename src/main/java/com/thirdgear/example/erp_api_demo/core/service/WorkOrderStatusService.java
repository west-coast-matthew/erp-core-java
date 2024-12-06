package com.thirdgear.example.erp_api_demo.core.service;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.entity.WorkOrderStatus;

@Service
public interface WorkOrderStatusService{
	
	public Iterable<WorkOrderStatus>getAllWorkOrderStatuses();
}