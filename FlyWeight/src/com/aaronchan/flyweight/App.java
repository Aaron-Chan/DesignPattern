package com.aaronchan.flyweight;

public class App {

	public static void main(String[] args) {
		LightFactory factory = new LightFactory();
		Light light1 = factory.getLight(LightType.BLUE);
		Light light2 = factory.getLight(LightType.BLUE);
		Light light3 = factory.getLight(LightType.GREEN);
		Light light4 = factory.getLight(LightType.RED);
		light1.light();
		light2.light();
		light3.light();
		light4.light();
	}

}
