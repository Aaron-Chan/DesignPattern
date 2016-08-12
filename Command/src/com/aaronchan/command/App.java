package com.aaronchan.command;

public class App {

	public static void main(String[] args) {
		TV tv = new TV();
		Command tvNextCommand = new TVNextCommand(tv);
		Command tvPreviousCommand = new TVPreviousCommand(tv);

		TVController controller = new TVController(tvNextCommand);
		controller.onButtonPressed();
		controller.onButtonPressed();
		controller.onButtonPressed();
		controller.onButtonPressed();
		controller.onButtonPressed();
		controller.onUndoButtonPressed();
		controller.onButtonPressed();
		controller.onUndoButtonPressed();
		controller.onUndoButtonPressed();

		controller.setCommand(tvPreviousCommand);

		controller.onButtonPressed();
		controller.onButtonPressed();
		controller.onUndoButtonPressed();
		controller.onButtonPressed();
		controller.onUndoButtonPressed();
		controller.onUndoButtonPressed();
	}

}
