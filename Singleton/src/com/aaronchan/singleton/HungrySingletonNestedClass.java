package com.aaronchan.singleton;

/**
 * �������ַ�ʽ����Ȼʹ��JVM������Ʊ�֤���̰߳�ȫ���⣻���� SingletonHolder ��˽�еģ����� getInstance()
 * ֮��û�а취�������� �����ֻ����getInstance()������ʱ�Ż�����������ͬʱ��ȡʵ����ʱ�򲻻����ͬ����û������ȱ�ݣ�Ҳ������ JDK �汾
 * 
 * @author AaronChan
 *
 */
public class HungrySingletonNestedClass {
	private static class SingletonHolder {
		private static final HungrySingletonNestedClass INSTANCE = new HungrySingletonNestedClass();
	}

	private HungrySingletonNestedClass() {
	}

	public static final HungrySingletonNestedClass getInstance() {
		return SingletonHolder.INSTANCE;
	}
}
