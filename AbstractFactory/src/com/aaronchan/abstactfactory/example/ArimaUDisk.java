package com.aaronchan.abstactfactory.example;

public class ArimaUDisk implements UDisk {

	private static final String DESCRIPTION = "this is ArimaUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
