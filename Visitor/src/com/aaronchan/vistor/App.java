package com.aaronchan.vistor;

import com.aaronchan.vistor.Apple.AppleType;
import com.aaronchan.vistor.Book.BookType;

public class App {

	public static void main(String[] args) {
		Apple apple1 = new Apple(AppleType.HOME_PRODUCT, 1);
		Apple apple2 = new Apple(AppleType.HOME_PRODUCT, 2);
		Book commonBook = new Book(BookType.BOOK_COMMON);
		Book saleBook = new Book(BookType.BOOK_SALE);
		Book newBook = new Book(BookType.BOOK_NEW);

		GoodsOrder goodsOrder = new GoodsOrder();
		goodsOrder.addGood(apple1);
		goodsOrder.addGood(apple2);
		goodsOrder.addGood(commonBook);
		goodsOrder.addGood(saleBook);
		goodsOrder.addGood(newBook);

		GoodVisitor packingClerk = new PackingClerk();
		GoodVisitor accounting = new Accounting();
		goodsOrder.acceptVisitor(packingClerk);
		goodsOrder.acceptVisitor(accounting);
	}

}
