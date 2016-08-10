package com.aaronchan.factory.method.mulit.example;

public abstract class Cola {

	private Size brand;

	public Cola(Size brand) {
		super();
		this.brand = brand;

	}

	@Override
	public String toString() {
		return this.getClass().getSimpleName() + " [brand=" + brand + "]";
	}

}
