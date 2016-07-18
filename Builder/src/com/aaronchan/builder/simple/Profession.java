package com.aaronchan.builder.simple;

public enum Profession {
	WARRIOR("warrior"), ENCHANTER("enchanter"), ARCHER("archer");
	private String title;

	Profession(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
