package com.aaronchan.abstactfactory;

public class FoxconnFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {

		return new FoxconnPhone();
	}

	@Override
	public Tablet produceTabblet() {
		return new FoxconnTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new FoxconnUDisk();
	}

}
