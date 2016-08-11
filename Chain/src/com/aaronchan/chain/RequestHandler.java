package com.aaronchan.chain;

public abstract class RequestHandler {
	private RequestHandler next;

	public RequestHandler(RequestHandler requestHandler) {
		this.next = requestHandler;
	}

	public void handleRequest(Request request) {
		if (next!=null) {
			printHanding(request);
			request.handled();
		}
	}

	public void printHanding(Request request) {
		System.out.println(this + " handle " + request);
	}

	@Override
	public abstract String toString();
}
