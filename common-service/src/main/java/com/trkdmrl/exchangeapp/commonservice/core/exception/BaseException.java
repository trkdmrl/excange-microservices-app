package com.trkdmrl.exchangeapp.commonservice.core.exception;

import java.util.List;

public class BaseException extends RuntimeException {

	private static final long serialVersionUID = 5957650331051265767L;

	private String type;

	private List<String> errors;

	public BaseException(String type, String message, List<String> errors) {
		super(message);
		this.type = type;
		this.errors = errors;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public String getType() {
		return type;
	}

	public List<String> getErrors() {
		return errors;
	}

}