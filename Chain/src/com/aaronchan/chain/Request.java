package com.aaronchan.chain;

public class Request {
	private String description;
	private RequestType requestType;

	private boolean isHandled;

	public void handled() {
		isHandled = true;
	}

	public Request(RequestType requestType, String description) {
		super();
		this.requestType = requestType;
		this.description = description;
	}

	public RequestType getRequestType() {
		return requestType;
	}

	@Override
	public String toString() {
		return requestType + " description:" + description;
	}

}
