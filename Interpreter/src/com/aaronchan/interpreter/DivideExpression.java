package com.aaronchan.interpreter;

public class DivideExpression extends OperationExpression {

	@Override
	public double interpreter() {
		super.operation();
		return leftExpression.interpreter() - rightExpression.interpreter();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return null;
	}

}
