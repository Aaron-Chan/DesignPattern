package com.aaronchan.abstactfactory.classic;

public class ConcreteFactory2 extends Factory {

	@Override
	public AbstractProductA createProductA() {
		return new ConcreteProductA2();
	}

	@Override
	public AbstractProductB createProductB() {
		return new ConcreteProductB1();
	}

}
