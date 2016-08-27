package com.aaronchan.abstactfactory.example;

public interface ElectronicProductFactory {
	public Phone producePhone();
	public Tablet produceTablet();
	public UDisk produceUDisk();
}
