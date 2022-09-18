package com.trkdmrl.exchangeapp.commonservice.core.exception;
import java.util.List;

public class RestException extends BaseException {
	public RestException(String type, String message, List<String> errors) {
		super(type, message, errors);
	}
}
