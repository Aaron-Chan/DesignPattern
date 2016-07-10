package com.aaronchan.factory.method.stati;

public enum Gender {
	MALE("male"), FEMALE("female");

	private String title;

	Gender(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
