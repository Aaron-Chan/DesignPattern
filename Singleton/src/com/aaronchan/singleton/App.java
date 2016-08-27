package com.aaronchan.singleton;

public class App {

	public static void main(String[] args) {
		EasySingleton easySingleton1 = EasySingleton.INSTANCE;
		EasySingleton easySingleton2 = EasySingleton.INSTANCE;
		System.out.println(easySingleton1);
		System.out.println(easySingleton2);

		HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
		HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
		System.out.println(hungrySingleton1);
		System.out.println(hungrySingleton2);

		HungrySingletonNestedClass hungrySingletonNestedClass1 = HungrySingletonNestedClass.getInstance();
		HungrySingletonNestedClass hungrySingletonNestedClass2 = HungrySingletonNestedClass.getInstance();
		System.out.println(hungrySingletonNestedClass1);
		System.out.println(hungrySingletonNestedClass2);

		LazySingleton lazySingleton1 = LazySingleton.getInstance();
		LazySingleton lazySingleton2 = LazySingleton.getInstance();
		System.out.println(lazySingleton1);
		System.out.println(lazySingleton2);

		LazySingletonDoubleCheck lazySingletonDoubleCheck1 = LazySingletonDoubleCheck.getInstance();
		LazySingletonDoubleCheck lazySingletonDoubleCheck2 = LazySingletonDoubleCheck.getInstance();
		System.out.println(lazySingletonDoubleCheck1);
		System.out.println(lazySingletonDoubleCheck2);

		LazySingletonSafe lazySingletonSafe1 = LazySingletonSafe.getInstance();
		LazySingletonSafe lazySingletonSafe2 = LazySingletonSafe.getInstance();
		System.out.println(lazySingletonSafe1);
		System.out.println(lazySingletonSafe2);

		LazySingletonVolatile lazySingletonVolatile1 = LazySingletonVolatile.getInstance();
		LazySingletonVolatile lazySingletonVolatile2 = LazySingletonVolatile.getInstance();
		System.out.println(lazySingletonVolatile1);
		System.out.println(lazySingletonVolatile2);
	}

}
