package com.aaronchan.chain;

public enum RequestType {

	DISTRIBUTION_LEVEL_A("distribution level a"), DISTRIBUTION_LEVEL_B("distribution level b"), DISTRIBUTION_LEVEL_C(
			"distribution level c");

	private String title;

	RequestType(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
