package com.aaronchan.abstactfactory.example;

public class App {

	public static void main(String[] args) {
		ElectronicProductFactory a = new ArimaFactory();
		Phone aPhone = a.producePhone();
		Tablet aTablet = a.produceTablet();
		UDisk aUDisk = a.produceUDisk();
		ElectronicProductFactory b = new IACFactory();
		Phone iPhone = b.producePhone();
		Tablet iTablet = b.produceTablet();
		UDisk iUDisk = b.produceUDisk();
		ElectronicProductFactory c = new FoxconnFactory();
		Phone fPhone = c.producePhone();
		Tablet fTablet = c.produceTablet();
		UDisk fUDisk = c.produceUDisk();
		System.out.println("ArimaFactory" + "phone:" + aPhone.getDescription() + "\n" + "Tablet:"
				+ aTablet.getDescription() + "\n" + "UDisk:" + aUDisk.getDescription());
		System.out.println("IACFactory" + "phone:" + iPhone.getDescription() + "\n" + "Tablet:"
				+ iTablet.getDescription() + "\n" + "UDisk:" + iUDisk.getDescription());
		System.out.println("FoxconnFactory" + "phone:" + fPhone.getDescription() + "\n" + "Tablet:"
				+ fTablet.getDescription() + "\n" + "UDisk:" + fUDisk.getDescription());
	}

}
