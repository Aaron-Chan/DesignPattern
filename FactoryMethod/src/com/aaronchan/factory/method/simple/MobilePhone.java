package com.aaronchan.factory.method.simple;

public abstract class MobilePhone {
	protected OS os;


	public OS getOs() {
		return os;
	}


	public void setOs(OS os) {
		this.os = os;
	}


	@Override
	public String toString() {
		return "MobilePhone [os=" + os + "]";
	}
	
}
