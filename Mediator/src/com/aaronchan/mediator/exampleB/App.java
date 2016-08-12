package com.aaronchan.mediator.exampleB;

public class App {
	public static void main(String[] args) {

		AbstractChatRoom chatRoom = new ChatRoom();
		Jack jack = new Jack();
		Lily lily = new Lily();
		Lulu lulu = new Lulu();
		chatRoom.addColleague(jack);
		chatRoom.addColleague(lily);
		chatRoom.addColleague(lulu);
		jack.sendMessage("Hi, I'm Jack.");
		lily.sendMessage("Today is a nice day!");
		lulu.sendMessage("Let's go for dinner!");
	}
}
