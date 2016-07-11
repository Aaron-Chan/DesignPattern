package com.aaronchan.factory.method.mulit;

public class MultiFactoryApp {

	public static void main(String[] args) {
		ColaFactory factory = new ColaFactory();
		Cola firstCola = factory.produceCocaCola(Size.BOTTLING);
		System.out.println(firstCola);
		Cola secondCola = factory.producePensiCola(Size.CANNED);
		System.out.println(secondCola);
	}

}
