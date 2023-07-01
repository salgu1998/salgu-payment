package com.salgu.salgupayment.util.exception;

import com.salgu.salgupayment.util.response.ResponseCodeEnum;
import lombok.Getter;

@Getter
public class CustomException extends RuntimeException{

	private ResponseCodeEnum responseCodeEnum = null;

	public CustomException(String message) {
		super(message);
	}

	public CustomException(ResponseCodeEnum code) {
		super(code.getMessage());
		this.responseCodeEnum = code;
	}

	public CustomException(ResponseCodeEnum code, String message) {
		super(message);
		this.responseCodeEnum = code;
	}
}