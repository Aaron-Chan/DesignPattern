package com.aaronchan.abstactfactory.example;

public class IACPhone extends Phone {

	public static final String DESCRIPTION = "this is IACPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
