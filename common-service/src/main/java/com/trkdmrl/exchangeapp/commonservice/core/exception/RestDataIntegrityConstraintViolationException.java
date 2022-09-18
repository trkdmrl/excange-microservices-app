package com.trkdmrl.exchangeapp.commonservice.core.exception;

import lombok.Builder;

import java.util.List;

public class RestDataIntegrityConstraintViolationException extends RestException {


	private static final long serialVersionUID = -3328354542147058649L;

	public RestDataIntegrityConstraintViolationException() {
		super("", "", null);
	}
	
	@Builder
	private RestDataIntegrityConstraintViolationException(String message, List<String> errors) {
		super("", message, errors);
	}
	

}
