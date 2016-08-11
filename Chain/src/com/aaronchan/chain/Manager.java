package com.aaronchan.chain;

public class Manager extends RequestHandler {

	public Manager(RequestHandler requestHandler) {
		super(requestHandler);
	}

	@Override
	public String toString() {
		return "manager";
	}

	@Override
	public void handleRequest(Request request) {
		if (request.getRequestType() == RequestType.DISTRIBUTION_LEVEL_B) {
			printHanding(request);
			request.handled();
		} else {
			super.handleRequest(request);
		}
	}

}
