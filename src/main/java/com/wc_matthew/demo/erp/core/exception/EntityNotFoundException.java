package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class EntityNotFoundException extends BaseException{
	
	public EntityNotFoundException(String detailMsg) {
		super("Entity not found", detailMsg, ErrorConstants.ENTITY_NOT_FOUND);
	}
}