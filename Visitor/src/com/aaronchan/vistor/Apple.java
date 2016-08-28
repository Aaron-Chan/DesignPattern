package com.aaronchan.vistor;

public class Apple extends Good {
	private AppleType type;
	private int weight;

	public static enum AppleType {
		HOME_PRODUCT, IMPORT_PRODUCT;
	}

	@Override
	public void acceptVisitor(GoodVisitor goodVisitor) {
		goodVisitor.visitApple(this);
	}

	public Apple(AppleType type, int weight) {
		super();
		this.type = type;
		this.weight = weight;
	}

	public AppleType getType() {
		return type;
	}

	public int getWeight() {
		return weight;
	}

	@Override
	public int getPrice() {
		int unitPrice = type == AppleType.HOME_PRODUCT ? 4 : 8;
		return weight * unitPrice;
	}

}
