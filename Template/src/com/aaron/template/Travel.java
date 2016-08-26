package com.aaron.template;

public abstract class Travel {
	public abstract String getDestination();

	public abstract void goDestination();

	public abstract void visit();

	public void go() {
		System.out.println(String.format("This'travel destination is %s", getDestination()));
		goDestination();
		visit();
	}
}
