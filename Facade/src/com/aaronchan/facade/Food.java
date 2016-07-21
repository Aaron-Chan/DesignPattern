package com.aaronchan.facade;

public class Food {
	private String name;

	public Food(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "food named " + this.name;
	}

}
