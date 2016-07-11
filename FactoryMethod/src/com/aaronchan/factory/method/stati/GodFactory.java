package com.aaronchan.factory.method.stati;

public class GodFactory {
	public static Hubman produceMan(Color color) {
		return new Man(color);
	}

	public static Hubman produceWoman(Color color) {
		return new Woman(color);
	}
}
