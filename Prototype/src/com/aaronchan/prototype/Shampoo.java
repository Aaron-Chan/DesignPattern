package com.aaronchan.prototype;

public abstract class Shampoo extends Prototype{
	@Override
	public abstract Shampoo clone() throws CloneNotSupportedException;
}
