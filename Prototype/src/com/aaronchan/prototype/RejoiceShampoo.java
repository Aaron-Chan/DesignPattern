package com.aaronchan.prototype;

public class RejoiceShampoo extends Shampoo {

	@Override
	public Shampoo clone() throws CloneNotSupportedException {
		return new RejoiceShampoo();
	}

}
