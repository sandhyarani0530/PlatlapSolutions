package com.platlap.exception;

public class ErrorDetails {
	private String errorRessage;
	private String erroCode;

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
		return "ErrorDetails [errorRessage=" + errorRessage + ", erroCode=" + erroCode + "]";
	}
}
