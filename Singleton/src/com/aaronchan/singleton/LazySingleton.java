package com.aaronchan.singleton;

/**
 * 线程不安全
 * 
 * @author AaronChan
 *
 */
public class LazySingleton {
	private static LazySingleton instance;

	public static LazySingleton getInstance() {
		if (instance == null) {
			instance = new LazySingleton();
		}
		return instance;
	}
private  LazySingleton() {
		
	}
}
