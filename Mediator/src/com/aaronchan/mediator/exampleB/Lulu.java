package com.aaronchan.mediator.exampleB;

public class Lulu extends Colleague {

	@Override
	public void receivedMessage(String message) {
		System.out.println("Lulu received message:" + message);
	}

}
