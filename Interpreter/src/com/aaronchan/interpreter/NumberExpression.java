package com.aaronchan.interpreter;

public class NumberExpression extends Expression {
	private double number;

	public NumberExpression(double number) {
		super();
		this.number = number;
	}

	@Override
	public double interpreter() {
		return number;
	}

	@Override
	public String toString() {
		return String.valueOf(number);
	}

}
