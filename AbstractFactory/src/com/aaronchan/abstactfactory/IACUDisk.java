package com.aaronchan.abstactfactory;

public class IACUDisk extends UDisk {
	private static final String DESCRIPTION = "this is IACUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}
}
