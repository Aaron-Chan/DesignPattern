/**
 * 
 */
package com.aaronchan.builder.simple;

public enum HairStyle {
	SHORT("short"), LONG("long"), BALD("bald");
	private String title;

	HairStyle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}
}
