package com.aaronchan.singleton;

/**
 * �̰߳�ȫ����������Ч����Ϊÿ�ε��ö���˫����
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
}
