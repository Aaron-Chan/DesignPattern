package com.aaronchan.factory.method.stati;

public abstract class Hubman {
	private Color gender;

	public Hubman(Color gender) {
		super();
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [gender=" + gender + "]";
	}

}
