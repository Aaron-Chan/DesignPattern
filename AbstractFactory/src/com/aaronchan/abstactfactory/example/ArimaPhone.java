package com.aaronchan.abstactfactory.example;

public class ArimaPhone extends Phone {

	public static final String DESCRIPTION = "this is ArimaPhone";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
