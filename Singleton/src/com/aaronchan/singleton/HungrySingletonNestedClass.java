package com.aaronchan.singleton;

/**
 * 上面这种方式，仍然使用JVM本身机制保证了线程安全问题；由于 SingletonHolder 是私有的，除了 getInstance()
 * 之外没有办法访问它， 因此它只有在getInstance()被调用时才会真正创建；同时读取实例的时候不会进行同步，没有性能缺陷；也不依赖 JDK 版本
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
