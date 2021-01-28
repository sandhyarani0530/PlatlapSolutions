package com.platlap.exception;

public class NotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundException() {
		super();
	}

	private String errorRessage;
	private String erroCode;

	public NotFoundException(String errorRessage, String erroCode) {
		super();
		this.errorRessage = errorRessage;
		this.erroCode = erroCode;
	}

	public String getErrorRessage() {
		return errorRessage;
	}

	public void setErrorRessage(String errorRessage) {
		this.errorRessage = errorRessage;
	}

	public String getErroCode() {
		return erroCode;
	}

	public void setErroCode(String erroCode) {
		this.erroCode = erroCode;
	}

	@Override
	public String toString() {
		return "TwitterException [errorRessage=" + errorRessage + ", erroCode=" + erroCode + "]";
	}


}
