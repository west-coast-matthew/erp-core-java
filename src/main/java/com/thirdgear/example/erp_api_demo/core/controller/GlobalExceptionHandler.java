package com.thirdgear.example.erp_api_demo.core.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.thirdgear.example.erp_api_demo.core.constants.ErrorConstants;
import com.thirdgear.example.erp_api_demo.core.exception.InvalidRequestException;
import com.thirdgear.example.erp_api_demo.core.service.ExceptionHandlerService;

@ControllerAdvice
public class GlobalExceptionHandler {
	
	@Autowired 
	ExceptionHandlerService exceptionService;
	
	@ExceptionHandler(InvalidRequestException.class)
    public ResponseEntity<String> handleCustomException(InvalidRequestException ex) {
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(ex.getMessage());
    }
	
	
    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorMsg> handleGlobalException(Exception ex) {
    	
    	exceptionService.logException(ex);	
    	
    	HttpHeaders responseHeaders = new HttpHeaders();
        responseHeaders.set("My-Custom-Header", "My-Custom-Value");
    	
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(new ErrorMsg(ErrorConstants.SYSTEM_ERROR, "An system exception ocurred"));    
    }
    
}
