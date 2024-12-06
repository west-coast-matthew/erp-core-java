package com.thirdgear.example.erp_api_demo.core.service;

/**
 * ExceptionHandlerService.java
 * 
 * Used to proxy all exceptions to a third party error reporting framework. 
 * Intent is to report all exceptions to this service. This class abstracts the actual 
 * proxy all exceptions into this class. Consumers are abstracted from the actual third 
 * party implementation of this class.    
 */
public interface ExceptionHandlerService {
	
	public void logException(Exception ex);

}
