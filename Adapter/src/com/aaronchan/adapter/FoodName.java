package com.aaronchan.adapter;

public enum FoodName {
	BEEF_NOODLES("BeefNoodles"), STEAK("Steak");
	private String title;

	FoodName(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return this.title;
	}
}
