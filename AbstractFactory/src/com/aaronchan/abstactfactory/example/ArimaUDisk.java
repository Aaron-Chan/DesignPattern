package com.aaronchan.abstactfactory.example;

public class ArimaUDisk extends UDisk {

	public static final String DESCRIPTION = "this is ArimaUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
