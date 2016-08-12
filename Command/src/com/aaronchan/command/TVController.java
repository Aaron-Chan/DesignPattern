package com.aaronchan.command;

public class TVController {
	private Command mCommand;

	public TVController(Command command) {
		super();
		mCommand = command;
	}

	public Command getCommand() {
		return mCommand;
	}

	public void setCommand(Command command) {
		mCommand = command;
	}

	public void onButtonPressed() {
		mCommand.excute();
	}

	public void onUndoButtonPressed() {
		mCommand.undo();
	}

}
