package com.aaronchan.singleton;

/**
 * 线程安全，但并不高效，因为每次调用都是双重锁
 * 
 * @author AaronChan
 *
 */
public class LazySingletonSafe {
	private static LazySingletonSafe instance;

	public static synchronized LazySingletonSafe getInstance() {
		if (instance == null) {
			instance = new LazySingletonSafe();
		}
		return instance;
	}

	private LazySingletonSafe() {

	}

	@Override
	public String toString() {
		return String.format("%s hashcode:%s", this.getClass().getName(), this.hashCode());
	}
}
