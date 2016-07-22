package com.aaronchan.abstactfactory.example;

public class FoxconnUDisk implements UDisk {

	private static final String DESCRIPTION = "this is FoxconnUDisk";

	@Override
	public String getDescription() {
		return DESCRIPTION;
	}

}
