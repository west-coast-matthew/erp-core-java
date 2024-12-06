package com.thirdgear.example.erp_api_demo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thirdgear.example.erp_api_demo.core.entity.OperationCode;
import com.thirdgear.example.erp_api_demo.core.entity.Tank;
import com.thirdgear.example.erp_api_demo.core.service.OperationCodeService;

@RestController
@RequestMapping("/operationCode")
public class OperationCodeController {
	
    @Autowired
    OperationCodeService opCodeService;

    @GetMapping
    public Iterable<OperationCode> getOperationCodes(){
    	Iterable<OperationCode> opCodes =  opCodeService.getOperationCodes();
        return opCodes;
    } 
    

}
