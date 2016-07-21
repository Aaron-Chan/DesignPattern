package com.aaronchan.bridge;

public class App {
	public static void main(String[] args) {
		Navigator navigator1 = new ChinaNavigator(new BDS());
		navigator1.navigate("ShenZhen");
		Navigator navigator2 = new AmericaNavigator(new GPS());
		navigator2.navigate("GoldenState");

		Navigator navigator3 = new ChinaNavigator(new GPS());
		navigator3.navigate("ShenZhen");
		Navigator navigator4 = new AmericaNavigator(new BDS());
		navigator4.navigate("GoldenState");
	}
}
