package com.aaronchan.factory.method.mulit.classic;

public class App {

	public static void main(String[] args) {
		AbstractProduct product;
		Factory factory = new Factory();
		product = factory.produceProductA();
		AbstractProduct product2 = factory.produceProductB();

	}

}
