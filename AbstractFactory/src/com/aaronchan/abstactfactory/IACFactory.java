package com.aaronchan.abstactfactory;

public class IACFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {
		return new IACPhone();
	}

	@Override
	public Tablet produceTabblet() {
		return new IACTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new IACUDisk();
	}

}
