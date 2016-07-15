package com.aaronchan.prototype;

public class CrestToothpaste extends Toothpaste {

	@Override
	public Toothpaste clone() throws CloneNotSupportedException {
		return new CrestToothpaste();
	}

}
