package com.aaronchan.abstactfactory;

public class ArimaPhone extends Phone {

	private static final String DESCRIPTION = "this is ArimaPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
