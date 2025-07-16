package com.wc_matthew.demo.erp.core.exception;

import com.wc_matthew.demo.erp.core.constants.ErrorConstants;

public class SystemErrException extends BaseException{
	
	public SystemErrException(String detailMsg) {
		super("Invalid request", detailMsg, ErrorConstants.ERR_CODE_SYSTEM_ERR);
	}
}