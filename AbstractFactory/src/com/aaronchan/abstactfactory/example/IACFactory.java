package com.aaronchan.abstactfactory.example;

public class IACFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {
		return new IACPhone();
	}

	@Override
	public Tablet produceTablet() {
		return new IACTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new IACUDisk();
	}

}
