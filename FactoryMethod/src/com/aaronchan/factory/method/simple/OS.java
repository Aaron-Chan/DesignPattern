package com.aaronchan.factory.method.simple;

public enum OS {
	Android("Android"), IOS("IOS");
	private String title;

	OS(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
