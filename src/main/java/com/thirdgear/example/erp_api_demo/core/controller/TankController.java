package com.thirdgear.example.erp_api_demo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.service.TankService;

@RestController
@RequestMapping("/tank")
public class TankController {

	@Autowired
	TankService tankService;
	
	@GetMapping
    public Iterable<Tank> getTanks(){
    	
    	Iterable<Tank> tanks = tankService.getTanks();
    	
        return tanks;
    } 
	
}
