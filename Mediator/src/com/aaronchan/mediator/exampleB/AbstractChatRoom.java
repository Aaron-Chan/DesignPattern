package com.aaronchan.mediator.exampleB;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractChatRoom {
	protected List<Colleague> mColleagues;

	public AbstractChatRoom() {
		mColleagues = new ArrayList<>();
	}

	public void addColleague(Colleague colleague) {
		mColleagues.add(colleague);
		colleague.joinChatRoom(this);
	}

	public abstract void sendMessage(String message, Colleague colleague);

}
