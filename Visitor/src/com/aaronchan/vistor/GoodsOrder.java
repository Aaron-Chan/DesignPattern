package com.aaronchan.vistor;

import java.util.ArrayList;
import java.util.List;

public class GoodsOrder {
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

	public void acceptVisitor(GoodVisitor goodVisitor) {
		for (Good good : goods) {
			good.acceptVisitor(goodVisitor);
		}
	}

}
