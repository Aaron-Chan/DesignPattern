package com.aaronchan.state;

public class Cattle {
	private State currentState;

	public Cattle() {
		super();
		currentState = new EnergeticState(this);
	}

	public void timePass() {
		if (currentState.getClass().equals(EnergeticState.class)) {
			changeToState(new ExhaustedState(this));
		} else {
			changeToState(new EnergeticState(this));
		}
	}

	private void changeToState(State state) {
		currentState = state;
		currentState.onEnter();
	}

	public void plow() {
		currentState.plow();
	}

	@Override
	public String toString() {
		return "Cattle";
	}

}
