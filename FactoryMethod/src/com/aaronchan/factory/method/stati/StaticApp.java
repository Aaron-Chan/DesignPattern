package com.aaronchan.factory.method.stati;

public class StaticApp {

	public static void main(String[] args) {
		Hubman produceMan = GodFactory.produceMan();
		System.out.println(produceMan);
		Hubman produceWoman = GodFactory.produceWoman();
		System.out.println(produceWoman);
	}

}
