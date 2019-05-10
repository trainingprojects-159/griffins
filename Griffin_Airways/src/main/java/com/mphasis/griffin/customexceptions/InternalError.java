package com.mphasis.griffin.customexceptions;

public class InternalError extends Exception {
	public InternalError(String message) {
		super(message);
	}

	public InternalError(String message, Throwable cause) {
		super(message, cause);
	}
}
