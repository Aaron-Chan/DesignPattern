package com.aaronchan.singleton;

/**
 * Ĭ��ö��ʵ���Ĵ������̰߳�ȫ�ģ����Բ���Ҫ�����̰߳�ȫ�����⡣������ö���е������κη������̰߳�ȫ�ɳ���Ա�Լ�����
 * ���з�ֹ�����ͨ��������Ƶ���˽�ù�������
 * 
 * ����汾�����������˾�����������⡣����Ҳ�ǳ��򵥣�ʵ���޷����á���Ҳ���°�ġ�Effective Java�����Ƽ���ģʽ��
 * 
 * @author AaronChan
 *
 */
public enum EasySingleton {
	INSTANCE;

	@Override
	public String toString() {
		return String.format("%s hashcode:%s", this.getClass().getName(), this.hashCode());
	}
}
