package com.aaronchan.decorator;

public class App {

	public static void main(String[] args) {
		Car car = new Benz();
		Car weddingCar = new WeddingCar(car);
		weddingCar.run();
	}

}
