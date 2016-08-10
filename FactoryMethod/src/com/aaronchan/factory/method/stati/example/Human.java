package com.aaronchan.factory.method.stati.example;

public abstract class Human {
	private Color color;

	public Human(Color gender) {
		super();
		this.color = gender;
	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [gender=" + color + "]";
	}

}
