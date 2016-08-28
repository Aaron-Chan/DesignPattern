package com.aaronchan.interpreter;

public abstract class OperationExpression extends Expression {
	protected Expression leftExpression;
	protected Expression rightExpression;

	protected void operation() {
		System.out.println(String.format("%f %s %f", leftExpression, this, rightExpression));
	}

	public void setLeftExpression(Expression expression) {
		leftExpression = expression;
	};

	public void setRightExpression(Expression expression) {
		rightExpression = expression;
	};
}
