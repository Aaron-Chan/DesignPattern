package com.aaronchan.singleton;

/**
 * 默认枚举实例的创建是线程安全的，所以不需要担心线程安全的问题。但是在枚举中的其他任何方法的线程安全由程序员自己负责。
 * 还有防止上面的通过反射机制调用私用构造器。
 * 
 * 这个版本基本上消除了绝大多数的问题。代码也非常简单，实在无法不用。这也是新版的《Effective Java》中推荐的模式。
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
