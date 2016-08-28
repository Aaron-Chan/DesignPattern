package com.aaronchan.vistor;

public class PackingClerk implements GoodVisitor {

	@Override
	public void visitBook(Book book) {
		System.out.println(String.format("%s pack book with beautiful wrapper paper", this));
	}

	@Override
	public String toString() {
		return "PackingClerk";
	}

	@Override
	public void visitApple(Apple apple) {
		System.out.println(String.format("%s pack apples with %s", this,
				apple.getType() == Apple.AppleType.HOME_PRODUCT ? "plastic bag" : "carton"));
	}

}
