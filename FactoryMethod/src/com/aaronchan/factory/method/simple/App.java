package com.aaronchan.factory.method.simple;

public class App {
	public static void main(String[] args) {
		MobilePhoneFactory factory = new MobilePhoneFactory();
		MobilePhone firstPhone = factory.produce("android");
		System.out.println(firstPhone);
		MobilePhone secondPhone = factory.produce("ios");
		System.out.println(secondPhone);
	}
}
