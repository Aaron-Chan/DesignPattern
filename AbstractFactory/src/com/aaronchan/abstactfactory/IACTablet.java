package com.aaronchan.abstactfactory;

public class IACTablet implements Tablet {
	private static final String DESCRIPTION = "this is IACTablet";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
