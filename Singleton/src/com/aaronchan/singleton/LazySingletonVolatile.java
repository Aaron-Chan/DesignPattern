package com.aaronchan.singleton;
/**
 * 使用 volatile 的主要原因是其另一个特性：禁止指令重排序优化。也就是说，
 * 在 volatile 变量的赋值操作后面会有一个内存屏障（生成的汇编代码上），读操作不会被重排序到内存屏障之前。
 * 比如上面的例子，取操作必须在执行完 1-2-3 之后或者 1-3-2 之后，不存在执行到 1-3 然后取到值的情况。从「先行发生原则」的角度理解的话，
 * 就是对于一个 volatile 变量的写操作都先行发生于后面对这个变量的读操作（这里的“后面”是时间上的先后顺序）。
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
