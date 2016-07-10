package com.aaronchan.factory.method.mulit;

public abstract class Cola {
	private Brand brand;

	public Cola(Brand brand) {
		super();
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "Cola [brand=" + brand + "]";
	}
	
}
