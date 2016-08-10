package com.aaronchan.factory.method.simple.classic;

public class App {

	public static void main(String[] args) {
		AbstractProduct product;
		Factory factory = new Factory();
		product = factory.produce("A");
	}

}
