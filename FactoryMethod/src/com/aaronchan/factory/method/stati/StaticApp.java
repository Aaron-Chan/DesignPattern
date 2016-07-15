package com.aaronchan.factory.method.stati;

public class StaticApp {

	public static void main(String[] args) {
		Human produceMan = GodFactory.produceMan(Color.WHITE);
		System.out.println(produceMan);
		Human produceWoman = GodFactory.produceWoman(Color.BLACK);
		System.out.println(produceWoman);
	}

}
