package com.aaronchan.factory.method.mulit;

public enum Brand {
	COCA("CocaCola"), PENSI("PensiCola");
	private String title;

	Brand(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
