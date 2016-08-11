package com.aaronchan.flyweight;

public class GreenLighter implements Light {
	@Override
	public void light() {
		System.out.println(String.format("green green light Light:%d", System.identityHashCode(this)));
	}
}
