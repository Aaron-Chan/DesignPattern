package com.aaronchan.singleton;

/**
 * �̲߳���ȫ
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

	private LazySingleton() {

	}
}
