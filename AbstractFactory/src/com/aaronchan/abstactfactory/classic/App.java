package com.aaronchan.abstactfactory.classic;

public class App {

	public static void main(String[] args) {

		Factory factory1 = new ConcreteFactory1();
		Factory factory2 = new ConcreteFactory2();

		AbstractProductA createProductA = factory1.createProductA();
		AbstractProductB createProductB = factory1.createProductB();

		AbstractProductA createProductA2 = factory2.createProductA();
		AbstractProductB createProductB2 = factory2.createProductB();
	}

}
