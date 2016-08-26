package com.aaron.template;

public class Travler {
	private Travel travel;

	public Travler(Travel travel) {
		super();
		this.travel = travel;
	}

	public void setTravel(Travel travel) {
		this.travel = travel;
	}

	public void travel() {
		travel.go();
	}
}
