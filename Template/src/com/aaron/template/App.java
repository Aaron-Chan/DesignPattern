package com.aaron.template;

public class App {

	public static void main(String[] args) {
		Travler travler = new Travler(new SichuanTravel());
		travler.travel();
		travler.setTravel(new FranceTravel());
		travler.travel();
	}

}
