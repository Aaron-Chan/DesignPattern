package com.aaronchan.factory.method.simple.classic;

public class Factory {
	public AbstractProduct produce(String type) {
		AbstractProduct product = null;
		if ("A".equals(type)) {
			product = new ConcreteProductA();
		} else if ("B".equals(type)) {
			product = new ConcreteProductB();
		}
		return product;
	}
}
