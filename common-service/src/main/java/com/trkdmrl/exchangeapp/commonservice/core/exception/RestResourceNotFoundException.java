package com.trkdmrl.exchangeapp.commonservice.core.exception;

import lombok.Builder;

import java.util.List;

public class RestResourceNotFoundException  extends RestException {

	public RestResourceNotFoundException() {
		super("", "", null);
	}
	
	@Builder
	private RestResourceNotFoundException(String message, List<String> errors) {
		super("", message, errors);
	}
}
