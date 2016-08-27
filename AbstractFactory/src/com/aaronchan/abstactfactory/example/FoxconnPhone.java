package com.aaronchan.abstactfactory.example;

public class FoxconnPhone extends Phone {
	public static final String DESCRIPTION = "this is FoxconnPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
