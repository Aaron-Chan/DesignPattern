package com.aaronchan.strategy;

public class RoastStrategy implements CookStrategy {

	@Override
	public void cook(Chicken chicken) {
		System.out.println(String.format(" roast %s ", chicken));
	}

}
