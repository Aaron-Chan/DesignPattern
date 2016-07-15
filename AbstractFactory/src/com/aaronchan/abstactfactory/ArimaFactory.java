package com.aaronchan.abstactfactory;

public class ArimaFactory implements ElectronicProductFactory {

	@Override
	public Phone producePhone() {
		return new ArimaPhone();
	}

	@Override
	public Tablet produceTabblet() {
		return new ArimaTablet();
	}

	@Override
	public UDisk produceUDisk() {
		return new ArimaUDisk();
	}

}
