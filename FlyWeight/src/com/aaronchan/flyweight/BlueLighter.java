package com.aaronchan.flyweight;

public class BlueLighter implements Light {
	@Override
	public void light() {
		System.out.println(String.format("blue blue  light Light:%d", System.identityHashCode(this)));
	}
}
