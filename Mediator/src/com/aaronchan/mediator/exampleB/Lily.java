package com.aaronchan.mediator.exampleB;

public class Lily extends Colleague {

	@Override
	public void receivedMessage(String message) {
		System.out.println("Lily received message:" + message);
	}

}
