package com.wc_matthew.demo.erp.core.service.impl;

import org.springframework.stereotype.Service;

import com.wc_matthew.demo.erp.core.service.ExceptionHandlerService;

@Service("ExceptionHandlingService")
public class ExceptionHandlingServiceImpl implements ExceptionHandlerService{

	@Override
	public void logException(Exception ex) {
		// todo: implement integration with sentry.io?
		
	}

}
