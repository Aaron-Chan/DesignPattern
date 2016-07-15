package com.aaronchan.abstactfactory;

public interface ElectronicProductFactory {
	public Phone producePhone();
	public Tablet produceTabblet();
	public UDisk produceUDisk();
}
