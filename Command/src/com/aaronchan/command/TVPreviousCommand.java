package com.aaronchan.command;

public class TVPreviousCommand implements Command {
	private TV mTV;
	private String mPreviousChannel;

	public TVPreviousCommand(TV tV) {
		super();
		mTV = tV;
	}

	@Override
	public void undo() {
		String currentChannel = mTV.getCurrentChannel();
		mTV.showChannel(mPreviousChannel);
		System.out.println("TVPreviousCommand undo" + " current channel:" + mTV.getCurrentChannel());
		mPreviousChannel = currentChannel;
	}

	@Override
	public void excute() {
		mPreviousChannel = mTV.getCurrentChannel();
		mTV.previousChannel();
		System.out.println("TVPreviousCommand excute" + " current channel:" + mTV.getCurrentChannel());
	}
}
