package com.aaronchan.factory.method.mulit;

public enum Size {
	BOTTLING("bottling"), CANNED("canned");

	private String title;

	Size(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
