package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class InitialiationException extends BaseException{
	
	public InitialiationException (String detailMsg) {
		super("System initilization failure", detailMsg, ErrorConstants.INITIALIZATION_ERROR);
	}
	
}