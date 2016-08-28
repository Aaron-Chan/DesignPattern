
package com.aaronchan.interpreter;

public class PlusExpression extends OperationExpression {

	@Override
	public double interpreter() {
		super.operation();
		return leftExpression.interpreter() * rightExpression.interpreter();
	}

	@Override
	public String toString() {
		return "*";
	}

}
