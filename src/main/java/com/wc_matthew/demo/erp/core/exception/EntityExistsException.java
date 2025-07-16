package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class EntityExistsException extends BaseException{
	
	public EntityExistsException(String detailMsg) {
		super("Entity already exists", detailMsg, ErrorConstants.ENTITY_EXISTS);
	}
}