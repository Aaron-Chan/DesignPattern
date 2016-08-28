package com.aaronchan.interpreter;

import java.util.Stack;

import com.sun.org.apache.xpath.internal.operations.Plus;

public class App {

	public static void main(String[] args) {
		String expression = "(((3*2)-2)+(1/45))";
		char[] charArray = expression.toCharArray();
		Stack<Expression> stack = new Stack<>();
		for (Character character : charArray) {
			if (isOperation(character)) {
				Expression operationExpression = getOperationExpression(character);
				stack.push(operationExpression);
			} else if (")".equals(character)) {
				Expression rightExpression = stack.pop();
				OperationExpression operationExpression = (OperationExpression) stack.pop();
				Expression leftExpression = stack.pop();
				operationExpression.setLeftExpression(leftExpression);
				operationExpression.setRightExpression(rightExpression);
				NumberExpression numberExpression = new NumberExpression(operationExpression.interpreter());
				stack.push(numberExpression);
			} else if (isNumber(character)) {
				Expression numberExpression = new NumberExpression(Double.valueOf(character));
				stack.push(numberExpression);
			}
		}
		System.out.println(String.format("result is:%s", stack.pop()));
	}

	private static boolean isNumber(Character character) {
		try {
			Double.valueOf(character);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	private static Expression getOperationExpression(Character character) {
		Expression expression;
		switch (character) {
		case '+':
			expression = new AddExpression();
			break;
		case '*':
			expression = new PlusExpression();
			break;
		case '/':
			expression = new DivideExpression();
			break;
		case '-':
			expression = new MinusExpression();
			break;
		default:
			throw new RuntimeException("invaild operation character");
		}
		return expression;
	}

	private static boolean isOperation(Character character) {
		return character.equals("+") || character.equals("/") || character.equals("*") || character.equals("-");
	}

}
