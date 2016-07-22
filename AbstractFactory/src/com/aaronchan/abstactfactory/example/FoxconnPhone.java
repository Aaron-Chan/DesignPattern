package com.aaronchan.abstactfactory.example;

public class FoxconnPhone implements Phone {
	private static final String DESCRIPTION = "this is FoxconnPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
