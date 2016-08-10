package com.aaronchan.abstactfactory;

public class ArimaUDisk extends UDisk {

	private static final String DESCRIPTION = "this is ArimaUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
