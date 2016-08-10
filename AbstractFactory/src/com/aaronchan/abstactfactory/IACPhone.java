package com.aaronchan.abstactfactory;

public class IACPhone extends Phone {

	private static final String DESCRIPTION = "this is IACPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
