package com.aaronchan.command;

public class TVNextCommand implements Command {
	private TV mTV;
	private String mPreviousChannel;

	public TVNextCommand(TV tV) {
		super();
		mTV = tV;
	}

	@Override
	public void undo() {
		String currentChannel = mTV.getCurrentChannel();
		mTV.showChannel(mPreviousChannel);
		System.out.println("TVNextCommand undo" + " current channel:" + mTV.getCurrentChannel());
		mPreviousChannel = currentChannel;
	}

	@Override
	public void excute() {
		mPreviousChannel = mTV.getCurrentChannel();
		mTV.nextChannel();
		System.out.println("TVNextCommand excute" + " current channel:" + mTV.getCurrentChannel());
	}

}
