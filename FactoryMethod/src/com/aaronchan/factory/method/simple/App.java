package com.aaronchan.factory.method.simple;

public class App {
	public static void main(String[] args) {
		MobilePhoneFactory factory = new MobilePhoneFactory();
		MobilePhone firstPhone = factory.produce(OS.Android);
		System.out.println(firstPhone);
		MobilePhone secondPhone = factory.produce(OS.IOS);
		System.out.println(secondPhone);
	}
}
