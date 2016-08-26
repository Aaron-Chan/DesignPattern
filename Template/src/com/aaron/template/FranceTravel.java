package com.aaron.template;

public class FranceTravel extends Travel {

	@Override
	public String getDestination() {
		return "France";
	}

	@Override
	public void goDestination() {
		System.out.println(String.format("go %s by plane", getDestination()));
	}

	@Override
	public void visit() {
		System.out.println("go to Paris,see beautiful lanspace,eat France cusine!");
	}

}
