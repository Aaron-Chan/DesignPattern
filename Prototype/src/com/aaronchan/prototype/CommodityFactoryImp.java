package com.aaronchan.prototype;

public class CommodityFactoryImp implements CommodityFactory {
	private Toothpaste mToothpaste;
	private Shampoo mShampoo;

	public CommodityFactoryImp(Toothpaste toothpaste, Shampoo shampoo) {
		super();
		mToothpaste = toothpaste;
		mShampoo = shampoo;
	}

	@Override
	public Toothpaste produceToothpaste() {
		Toothpaste toothpaste = null;
		try {
			toothpaste = mToothpaste.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		}
		return toothpaste;
	}

	@Override
	public Shampoo produceShampoo() {
		Shampoo shampoo = null;
		try {
			shampoo = mShampoo.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();

		}
		return shampoo;
	}

}
