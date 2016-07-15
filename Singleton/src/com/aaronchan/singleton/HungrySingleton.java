package com.aaronchan.singleton;

public class HungrySingleton {
	public static final HungrySingleton INSTANCE = new HungrySingleton();
	private  HungrySingleton() {
		
	}
	public static HungrySingleton getInstance() {
		return INSTANCE;
	}
}
