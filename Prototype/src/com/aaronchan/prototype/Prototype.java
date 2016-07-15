package com.aaronchan.prototype;

public abstract class Prototype implements Cloneable {
	@Override
	public abstract Object clone() throws CloneNotSupportedException;
	@Override
	public String toString() {
		return this.getClass().getSimpleName();
	}
}
