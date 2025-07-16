package com.wc_matthew.demo.erp.core.exception;

import org.springframework.http.HttpStatusCode;

/**
 * BaseException
 * 
 * Parent class for all custom application exceptions. 
 * 
 */
public abstract class BaseException extends RuntimeException{
	
	public BaseException() {
        super();
    }

	private String customMessage;
	private String errCode;
	protected HttpStatusCode httpStatusCode;
	
	/**
	 * All instances of custom exceptions used additional attributes in 
	 * conjunction with just a standard message. 
	 * 
	 * @param message Standard message for all instances of a given type.
	 * @param customMessage, provides additional contextual information, such as the 
	 * reason for why attribute or business logic fails.... 
	 * @param errCode Custom error code used to uniquely identify the exception 
	 * type, intended for use by external monitoring applications.
	 */
    public BaseException(String message, String customMessage, String errCode) {
        super(message);
        this.customMessage = customMessage;
        this.errCode = errCode;
    }

	public String getCustomMessage() {
		return customMessage;
	}

	public void setCustomMessage(String customMessage) {
		this.customMessage = customMessage;
	}

	public String getErrCode() {
		return errCode;
	}

	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}

	public HttpStatusCode getHttpStatusCode() {
		return httpStatusCode;
	}
	
}