package com.aaronchan.abstactfactory;

public class FoxconnTablet implements Tablet {

	private static final String DESCRIPTION = "this is FoxconnTablet";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
