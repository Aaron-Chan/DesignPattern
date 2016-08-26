package com.aaronchan.strategy;

public class Chicken {
	private CookStrategy cookStrategy;

	public Chicken(CookStrategy cookStrategy) {
		super();
		this.cookStrategy = cookStrategy;
	}

	public void setCookStrategy(CookStrategy cookStrategy) {
		this.cookStrategy = cookStrategy;
	}

	public void cook() {
		cookStrategy.cook(this);
	}

	@Override
	public String toString() {
		return "Chicken";
	}

}
