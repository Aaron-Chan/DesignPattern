package com.aaronchan.singleton;
/**
 * 单例会在加载类后一开始就被初始化，即使客户端没有调用 getInstance()方法。饿汉式的创建方式在一些场景中将无法使用：譬如 Singleton 实例的创建是依赖参数或者配置文件的，在 getInstance() 之前必须调用某个方法设置参数给它，那样这种单例写法就无法使用了。
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
