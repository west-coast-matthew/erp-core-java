package com.thirdgear.example.erp_api_demo.core.service.impl;

import org.springframework.stereotype.Service;

import com.thirdgear.example.erp_api_demo.core.service.ExceptionHandlerService;

@Service("ExceptionHandlerService")
public class SentryExceptionHandlerServiceImpl implements ExceptionHandlerService{

	@Override
	public void logException(Exception ex) {
		// TODO Auto-generated method stub
		// TODO: Implement with Sentry
	}
	
}
