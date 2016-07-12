package com.aaronchan.factory.method.stati;

public class GodFactory {
	public static Human produceMan(Color color) {
		return new Man(color);
	}

	public static Human produceWoman(Color color) {
		return new Woman(color);
	}
}
