package com.aaronchan.abstactfactory.example;

public interface ElectronicProductFactory {
	public Phone producePhone();
	public Tablet produceTabblet();
	public UDisk produceUDisk();
}
