package com.aaronchan.singleton;
/**
 * �������ڼ������һ��ʼ�ͱ���ʼ������ʹ�ͻ���û�е��� getInstance()����������ʽ�Ĵ�����ʽ��һЩ�����н��޷�ʹ�ã�Ʃ�� Singleton ʵ���Ĵ����������������������ļ��ģ��� getInstance() ֮ǰ�������ĳ���������ò����������������ֵ���д�����޷�ʹ���ˡ�
 * 
 * @author AaronChan
 *
 */
public class HungrySingleton {
	public static final HungrySingleton INSTANCE = new HungrySingleton();
	private  HungrySingleton() {
		
	}
	public static HungrySingleton getInstance() {
		return INSTANCE;
	}
}
