package com.aaronchan.decorator;

public class WeddingCar implements Car {
	private Car car;

	@Override
	public void run() {
		car.run();
		System.out.println("car play festive music");
	}

	public WeddingCar(Car car) {
		super();
		this.car = car;
	}

}
