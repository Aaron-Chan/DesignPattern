package com.aaronchan.abstactfactory.example;

public class ArimaFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {
		return new ArimaPhone();
	}

	@Override
	public Tablet produceTablet() {
		return new ArimaTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new ArimaUDisk();
	}

}
