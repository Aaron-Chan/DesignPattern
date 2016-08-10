package com.aaronchan.abstactfactory;

public class FoxconnUDisk extends UDisk {

	private static final String DESCRIPTION = "this is FoxconnUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
