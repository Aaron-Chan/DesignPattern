package com.aaronchan.builder.standard;

public class Product {
	private String partA;
	private String partB;

	public String getPartA() {
		return partA;
	}

	public void setPartA(String partA) {
		this.partA = partA;
	}

	public String getPartB() {
		return partB;
	}

	public void setPartB(String partB) {
		this.partB = partB;
	}

	public String getPartC() {
		return partC;
	}

	public void setPartC(String partC) {
		this.partC = partC;
	}

	private String partC;

	@Override
	public String toString() {
		return "Product [partA=" + partA + ", partB=" + partB + ", partC=" + partC + "]";
	}
	
	
}
