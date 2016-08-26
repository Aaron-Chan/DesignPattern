package com.aaronchan.state;

public class EnergeticState implements State {
	private Cattle cattle;

	public EnergeticState(Cattle cattle) {
		super();
		this.cattle = cattle;
	}

	@Override
	public void plow() {
		System.out.println(String.format("%s plow fastly and effectivly", cattle));

	}

	@Override
	public void onEnter() {
		System.out.println(String.format("%s become energetic", cattle));

	}

}
