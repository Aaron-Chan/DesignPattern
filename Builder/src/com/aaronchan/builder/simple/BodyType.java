package com.aaronchan.builder.simple;

public enum BodyType {
	HUGE("huge"), MEDIUM("Medium"), SMALL("small");
	private String title;

	BodyType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
