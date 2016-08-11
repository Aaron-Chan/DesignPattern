package com.aaronchan.flyweight;

public class RedLighter implements Light {

	@Override
	public void light() {
		System.out.println(String.format("red red light Light:%d", System.identityHashCode(this)));
	}

}
