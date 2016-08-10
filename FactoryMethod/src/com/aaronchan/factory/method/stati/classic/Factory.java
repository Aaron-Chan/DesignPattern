package com.aaronchan.factory.method.stati.classic;

public class Factory {
	public static AbstractProduct produceProductA() {
		return new ConcreteProductA();
	}
	
	public static AbstractProduct produceProductB() {
		return new ConcreteProductB();
	}
}
