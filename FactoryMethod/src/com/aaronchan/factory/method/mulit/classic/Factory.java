package com.aaronchan.factory.method.mulit.classic;

public class Factory {
	public AbstractProduct produceProductA() {
		return new ConcreteProductA();
	}
	
	public AbstractProduct produceProductB() {
		return new ConcreteProductB();
	}
}
