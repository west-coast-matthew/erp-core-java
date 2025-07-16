package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class EntityValidationFailureException extends BaseException{
	
	public EntityValidationFailureException(String detailMsg) {
		super("Entity validation failure", detailMsg, ErrorConstants.ENTITY_VALIDATION_ERR);
	}
}