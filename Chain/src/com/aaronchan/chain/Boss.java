package com.aaronchan.chain;

public class Boss extends RequestHandler {

	public Boss(RequestHandler requestHandler) {
		super(requestHandler);
	}

	@Override
	public String toString() {
		return "boss";
	}
	
	@Override
	public void handleRequest(Request request) {
		request.handled();
	}

}
