package com.aaronchan.chain;

public class Employee extends RequestHandler {

	public Employee(RequestHandler requestHandler) {
		super(requestHandler);
	}

	@Override
	public String toString() {
		return "Employee";
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.DISTRIBUTION_LEVEL_C) {
			printHanding(request);
			request.handled();
		}else{			
			super.handleRequest(request);
		}
	}

}
