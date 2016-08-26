package com.aaronchan.observer.genic;

public class GenicApp {
	public static void main(String[] args) {
		GSun gSun = new GSun();
		Dog dog = new Dog();
		Owl owl = new Owl();
		gSun.reigisterObserver(dog);
		gSun.reigisterObserver(owl);
		
		gSun.timePass();
		gSun.timePass();
		gSun.timePass();
		gSun.timePass();
	}
}
