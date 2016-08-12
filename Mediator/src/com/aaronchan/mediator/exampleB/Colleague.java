package com.aaronchan.mediator.exampleB;

public abstract class Colleague {
	private AbstractChatRoom mChatRoom;

	public void joinChatRoom(AbstractChatRoom chatRoom) {
		mChatRoom = chatRoom;
	}

	public void sendMessage(String message) {
		if (mChatRoom != null) {
			mChatRoom.sendMessage(message, this);
		}
	}

	public abstract void receivedMessage(String message);
}
