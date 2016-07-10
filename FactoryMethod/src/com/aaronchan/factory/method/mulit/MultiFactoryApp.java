package com.aaronchan.factory.method.mulit;

public class MultiFactoryApp {

	public static void main(String[] args) {
		ColaFactory factory = new ColaFactory();
		Cola firstCola = factory.producePensiCola();
		System.out.println(firstCola);
		Cola secondCola = factory.produceCocaCola();
		System.out.println(secondCola);
	}

}
