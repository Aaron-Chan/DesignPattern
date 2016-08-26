package com.aaronchan.strategy;

public class App {

	public static void main(String[] args) {
		FiredStrategy firedStrategy = new FiredStrategy();
		Chicken chicken = new Chicken(firedStrategy);
		chicken.cook();
		chicken.setCookStrategy(new RoastStrategy());
		chicken.cook();
	}

}
