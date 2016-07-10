package com.aaronchan.factory.method.mulit;

public class ColaFactory {
	public Cola producePensiCola() {
		return new CocaCola(Brand.COCA);
	}

	public Cola produceCocaCola() {
		return new PensiCola(Brand.PENSI);
	}
}
