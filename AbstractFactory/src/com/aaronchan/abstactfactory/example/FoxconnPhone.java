package com.aaronchan.abstactfactory.example;

public class FoxconnPhone extends Phone {
	private static final String DESCRIPTION = "this is FoxconnPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
