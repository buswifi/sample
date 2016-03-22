package com.linkedroad.util.exception;

public class PipelineException extends Exception {

	  private static final long serialVersionUID = 1L;

	  private String errorCode;

	  public PipelineException(String msg, String errorCode) {
	    super(msg);
	    this.errorCode = errorCode;
	  }

	  public PipelineException(String msg, String errorCode, Throwable cause) {
	    super(msg, cause);
	    this.errorCode = errorCode;
	  }

	  public String getErrorCode() {
	    return errorCode;
	  }

	  public void setErrorCode(String errorCode) {
	    this.errorCode = errorCode;
	  }


	}
