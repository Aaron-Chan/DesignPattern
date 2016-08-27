package com.aaronchan.singleton;

/**
 * �̰߳�ȫ ���μ�飬��Ҫ����instance = new Singleton()��䣬�Ⲣ����һ��ԭ�Ӳ�������ʵ���� JVM ����仰����������� 3
 * �����顣
 * 
 * 1 �� instance �����ڴ� 2 ���� Singleton �Ĺ��캯������ʼ����Ա���� 3 ��instance����ָ�������ڴ�ռ䣨ִ�����ⲽ
 * instance ��Ϊ�� null �ˣ� ���Լ��������£��п�����132������ 3 ִ����ϡ�2 δִ��֮ǰ�����̶߳���ռ�ˣ���ʱ instance
 * �Ѿ��Ƿ� null �ˣ���ȴû�г�ʼ�����������̶߳���ֱ�ӷ��� instance��Ȼ��ʹ�ã�Ȼ��˳����µر���
 * 
 * @author AaronChan
 *
 */
public class LazySingletonDoubleCheck {
	private static LazySingletonDoubleCheck instance;

	public static synchronized LazySingletonDoubleCheck getInstance() {
		if (instance == null) {
			synchronized (LazySingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new LazySingletonDoubleCheck();
				}
			}
		}
		return instance;
	}

	private LazySingletonDoubleCheck() {

	}

	@Override
	public String toString() {
		return String.format("%s hashcode:%s", this.getClass().getName(), this.hashCode());
	}
}
