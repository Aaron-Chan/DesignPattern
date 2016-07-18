package com.aaronchan.builder.standard;

public class Director {
	private Builder builder;

	public Director(Builder builder) {
		super();
		this.builder = builder;
	}
	public Product construct(){
		builder.buildPartA();
		builder.buildPartB();
		builder.buildPartC();
		return builder.getResult();
	}
}
