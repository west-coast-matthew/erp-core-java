package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class InvalidRequestException extends BaseException{
	
	public InvalidRequestException(String detailMsg) {
		super("Invalid request", detailMsg, ErrorConstants.INVALID_REQUEST);
	}
	
}