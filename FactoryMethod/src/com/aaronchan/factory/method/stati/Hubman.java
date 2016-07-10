package com.aaronchan.factory.method.stati;

public abstract class Hubman {
	private Gender gender;

	public Hubman(Gender gender) {
		super();
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Human [gender=" + gender + "]";
	}
	
}
