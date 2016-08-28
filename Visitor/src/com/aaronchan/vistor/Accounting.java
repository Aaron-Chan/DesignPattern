package com.aaronchan.vistor;

public class Accounting implements GoodVisitor {
	private int totalPrice;

	public int getTotalPrice() {
		return totalPrice;
	}

	@Override
	public void visitBook(Book book) {
		int bookPrice = book.getPrice();
		totalPrice += bookPrice;
		System.out.println(
				String.format("%s account book price %d ,and totoal price is %d", this, bookPrice, totalPrice));

	}

	@Override
	public String toString() {
		return "Accounting";
	}

	@Override
	public void visitApple(Apple apple) {
		int applePrice = apple.getPrice();
		totalPrice += applePrice;
		System.out.println(
				String.format("%s account apple price %d ,and totoal price is %d", this, applePrice, totalPrice));
	}

}
