package com.aaronchan.factory.method.stati;

public abstract class Human {
	private Color gender;

	public Human(Color gender) {
		super();
		this.gender = gender;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [gender=" + gender + "]";
	}

}
