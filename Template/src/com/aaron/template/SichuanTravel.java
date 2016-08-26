package com.aaron.template;

public class SichuanTravel extends Travel {

	@Override
	public String getDestination() {
		return "Sichuan";
	}

	@Override
	public void goDestination() {
		System.out.println(String.format("go %s by train", getDestination()));
	}

	@Override
	public void visit() {
		System.out.println("see panda,visit JiuZhaigou,eat Sichuan cusine!");
	}

}
