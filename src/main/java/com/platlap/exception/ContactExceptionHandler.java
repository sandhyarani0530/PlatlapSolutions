package com.platlap.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class ContactExceptionHandler {
	@ExceptionHandler(NotFoundException.class)
	public ResponseEntity<ErrorDetails> opaApiInvocationException(NotFoundException ex, WebRequest request) {

		ErrorDetails errorDetails = new ErrorDetails();
		errorDetails.setErroCode(ex.getErroCode());
		errorDetails.setErrorRessage(ex.getErrorRessage());
		return new ResponseEntity<>(errorDetails, HttpStatus.NO_CONTENT);
	}
}
