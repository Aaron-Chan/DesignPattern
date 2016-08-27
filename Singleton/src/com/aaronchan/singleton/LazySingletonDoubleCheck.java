package com.aaronchan.singleton;

/**
 * 线程安全 两次检查，主要在于instance = new Singleton()这句，这并非是一个原子操作，事实上在 JVM 中这句话大概做了下面 3
 * 件事情。
 * 
 * 1 给 instance 分配内存 2 调用 Singleton 的构造函数来初始化成员变量 3 将instance对象指向分配的内存空间（执行完这步
 * instance 就为非 null 了） 所以极端条件下，有可能在132，则在 3 执行完毕、2 未执行之前，被线程二抢占了，这时 instance
 * 已经是非 null 了（但却没有初始化），所以线程二会直接返回 instance，然后使用，然后顺理成章地报错。
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
