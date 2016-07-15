package com.aaronchan.prototype;

public class App {

	public static void main(String[] args) {
		Toothpaste toothpaste = new DarlieToothpaste();
		Shampoo shampoo = new RejoiceShampoo();
		CommodityFactory commodityFactory = new CommodityFactoryImp(toothpaste, shampoo);
		Shampoo produceShampoo = commodityFactory.produceShampoo();
		Toothpaste produceToothpaste = commodityFactory.produceToothpaste();
		System.out.println(toothpaste == produceToothpaste);
		System.out.println(shampoo == produceShampoo);
	}

}
