package com.aaronchan.mediator.exampleA;

public enum Action {
	GET_GOOD_MARKS("get good mark"), CRY("cry");

	private String title;

	private Action(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return title;
	}

}
