package com.aaronchan.factory.method.stati.classic;

public class App {

	public static void main(String[] args) {
		AbstractProduct product;
		product = Factory.produceProductA();
		AbstractProduct product2 = Factory.produceProductB();

	}

}
