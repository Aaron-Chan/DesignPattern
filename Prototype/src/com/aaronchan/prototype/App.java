package com.aaronchan.prototype;

public class App {

	public static void main(String[] args) {
		Toothpaste toothpaste;
		Shampoo shampoo;
		Shampoo produceShampoo;
		Toothpaste produceToothpaste;
		toothpaste = new DarlieToothpaste();
		shampoo = new RejoiceShampoo();
		CommodityFactory commodityFactory = new CommodityFactoryImp(toothpaste, shampoo);
		produceShampoo = commodityFactory.produceShampoo();
		produceToothpaste = commodityFactory.produceToothpaste();
		System.out.println(toothpaste == produceToothpaste);
		System.out.println(shampoo == produceShampoo);

		toothpaste = new CrestToothpaste();
		shampoo = new SassonShampoo();
		commodityFactory = new CommodityFactoryImp(toothpaste, shampoo);
		produceShampoo = commodityFactory.produceShampoo();
		produceToothpaste = commodityFactory.produceToothpaste();
		System.out.println(toothpaste == produceToothpaste);
		System.out.println(shampoo == produceShampoo);

	}

}
