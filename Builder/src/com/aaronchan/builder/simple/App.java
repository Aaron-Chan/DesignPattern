package com.aaronchan.builder.simple;

public class App {

	public static void main(String[] args) {
		Hero encourage = new Hero.Builder("encourage", Profession.WARRIOR).withBodyType(BodyType.MEDIUM)
				.withHairStyle(HairStyle.SHORT).build();
		Hero mini = new Hero.Builder("mini", Profession.ARCHER).withBodyType(BodyType.SMALL)
				.withHairStyle(HairStyle.BALD).build();
		System.out.println(encourage.toString());
		System.out.println(mini.toString());
		System.out.println(System.currentTimeMillis());
	}

}
