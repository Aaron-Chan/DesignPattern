package com.aaronchan.prototype;

public class SassonShampoo extends Shampoo {

	@Override
	public Shampoo clone() throws CloneNotSupportedException {
		return new SassonShampoo();
	}

}
