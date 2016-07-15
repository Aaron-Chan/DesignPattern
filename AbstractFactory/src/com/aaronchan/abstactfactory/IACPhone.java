package com.aaronchan.abstactfactory;

public class IACPhone implements Phone {

	private static final String DESCRIPTION = "this is IACPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
