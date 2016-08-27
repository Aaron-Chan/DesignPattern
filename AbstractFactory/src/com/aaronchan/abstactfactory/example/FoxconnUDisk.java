package com.aaronchan.abstactfactory.example;

public class FoxconnUDisk extends UDisk {

	public static final String DESCRIPTION = "this is FoxconnUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
