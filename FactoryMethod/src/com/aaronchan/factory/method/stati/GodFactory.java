package com.aaronchan.factory.method.stati;

public class GodFactory {
	public static Hubman produceMan() {
		return new Man(Gender.MALE);
	}

	public static Hubman produceWoman() {
		return new Man(Gender.FEMALE);
	}
}
