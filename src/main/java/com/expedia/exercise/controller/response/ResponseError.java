package com.expedia.exercise.controller.response;

public class ResponseError {

	private String message;

	public ResponseError(String message) {
		this.message = message;
	}

	public String getJsonResponse() {
		return "{\"error\": \"" + message + "\"}";
	}
}
