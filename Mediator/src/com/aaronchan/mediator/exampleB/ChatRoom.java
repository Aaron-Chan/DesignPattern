package com.aaronchan.mediator.exampleB;

public class ChatRoom extends AbstractChatRoom {

	@Override
	public void sendMessage(String message, Colleague original) {
		for (Colleague colleague : mColleagues) {
			if (!colleague.equals(original)) {
				colleague.receivedMessage(message);
			}
		}
	}

}
