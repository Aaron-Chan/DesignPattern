package com.aaronchan.vistor;

import java.util.ArrayList;
import java.util.List;

public class GoodsOrder extends Good {
	private List<Good> goods;

	public GoodsOrder() {
		super();
		goods = new ArrayList<>();
	}

	public void addGood(Good good) {
		goods.add(good);
	}

	public void removeGood(Good good) {
		goods.remove(good);
	}

	@Override
	public void acceptVisitor(GoodVisitor goodVisitor) {
		for (Good good : goods) {
			good.acceptVisitor(goodVisitor);
		}
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
}
