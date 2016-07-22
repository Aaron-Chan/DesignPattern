package com.aaronchan.abstactfactory.classic;

public class ConcreteFactory1 extends Factory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA1();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB2();
	}

}
