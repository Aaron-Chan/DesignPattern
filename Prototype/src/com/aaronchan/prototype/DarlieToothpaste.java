package com.aaronchan.prototype;

public class DarlieToothpaste extends Toothpaste {
	@Override
	public Toothpaste clone() throws CloneNotSupportedException {
		return new DarlieToothpaste();
	}

}
