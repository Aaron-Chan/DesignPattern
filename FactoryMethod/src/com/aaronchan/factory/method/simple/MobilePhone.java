package com.aaronchan.factory.method.simple;

public abstract class MobilePhone {
	private OS os;

	public MobilePhone(OS os) {
		super();
		this.os = os;
	}

	@Override
	public String toString() {
		return "MobilePhone [os=" + os + "]";
	}
	
}
