package com.aaronchan.mediator.exampleB;

public class Jack extends Colleague {

	@Override
	public void receivedMessage(String message) {
		System.out.println("Jack received message:" + message);
	}

}
