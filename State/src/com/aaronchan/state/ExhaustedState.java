package com.aaronchan.state;

public class ExhaustedState implements State {
	private Cattle cattle;

	public ExhaustedState(Cattle cattle) {
		super();
		this.cattle = cattle;
	}

	@Override
	public void plow() {
		System.out.println(String.format("%s plow slowly", cattle));

	}

	@Override
	public void onEnter() {
		System.out.println(String.format("%s become tired", cattle));

	}

}
