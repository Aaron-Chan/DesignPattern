package com.aaronchan.singleton;
/**
 * ʹ�� volatile ����Ҫԭ��������һ�����ԣ���ָֹ���������Ż���Ҳ����˵��
 * �� volatile �����ĸ�ֵ�����������һ���ڴ����ϣ����ɵĻ������ϣ������������ᱻ�������ڴ�����֮ǰ��
 * ������������ӣ�ȡ����������ִ���� 1-2-3 ֮����� 1-3-2 ֮�󣬲�����ִ�е� 1-3 Ȼ��ȡ��ֵ��������ӡ����з���ԭ�򡹵ĽǶ����Ļ���
 * ���Ƕ���һ�� volatile ������д���������з����ں������������Ķ�����������ġ����桱��ʱ���ϵ��Ⱥ�˳�򣩡�
 * 
 * @author AaronChan
 *
 */
public class LazySingletonVolatile {
	private static volatile LazySingletonVolatile instance;

	public static synchronized LazySingletonVolatile getInstance() {
		if (instance == null) {
			synchronized (LazySingletonDoubleCheck.class) {
				if (instance == null) {
					instance = new LazySingletonVolatile();
				}
			}
		}
		return instance;
	}

	private LazySingletonVolatile() {

	}
}
