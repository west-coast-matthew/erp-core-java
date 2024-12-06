package com.thirdgear.example.erp_api_demo.core.controller;

public class ErrorMsg {
	public String msg;
	public int code;
	public ErrorMsg(int code, String msg) {
		this.code = code;
		this.msg = msg;
	}
}
