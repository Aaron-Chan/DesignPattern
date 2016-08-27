package com.aaronchan.abstactfactory.example;

public class FoxconnFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {

		return new FoxconnPhone();
	}

	@Override
	public Tablet produceTablet() {
		return new FoxconnTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new FoxconnUDisk();
	}

}
