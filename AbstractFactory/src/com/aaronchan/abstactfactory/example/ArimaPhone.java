package com.aaronchan.abstactfactory.example;

public class ArimaPhone implements Phone {

	private static final String DESCRIPTION = "this is ArimaPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
