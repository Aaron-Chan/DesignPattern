package com.aaronchan.vistor;

public class Book extends Good {
	private BookType bookType;

	public static enum BookType {
		BOOK_SALE, BOOK_COMMON, BOOK_NEW;
	}

	@Override
	public void acceptVisitor(GoodVisitor goodVisitor) {
		goodVisitor.visitBook(this);
	}

	public BookType getBookType() {
		return bookType;
	}

	public Book(BookType bookType) {
		super();
		this.bookType = bookType;
	}

	@Override
	public int getPrice() {
		int price = 0;
		switch (bookType) {
		case BOOK_SALE:
			price = 20;
			break;
		case BOOK_COMMON:
			price = 50;
			break;
		case BOOK_NEW:
			price = 80;
			break;
		default:
			break;
		}
		return price;
	}

}
