package com.aaronchan.abstactfactory;

public class IACUDisk implements UDisk {
	private static final String DESCRIPTION = "this is IACUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
