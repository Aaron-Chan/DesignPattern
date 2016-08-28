package com.aaronchan.vistor;

public abstract class Good {
	public abstract void acceptVisitor(GoodVisitor goodVisitor);

	public abstract int getPrice();
}
