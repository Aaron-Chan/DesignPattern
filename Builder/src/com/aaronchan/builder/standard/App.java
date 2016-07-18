package com.aaronchan.builder.standard;

public class App {

	public static void main(String[] args) {
		Builder builder = new ConcreteBuilder();
		Director director = new Director(builder);
		Product product = director.construct();
		System.out.println(product.getPartA());
		System.out.println(product.toString());
	}

}
