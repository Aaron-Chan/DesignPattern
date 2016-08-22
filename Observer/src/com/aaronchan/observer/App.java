package com.aaronchan.observer;

public class App {

	public static void main(String[] args) {
		Man man = new Man();
		Mouse mouse = new Mouse();

		Sun sun = new Sun();
		sun.registerOberver(man);
		sun.registerOberver(mouse);
		sun.timePass();
		sun.timePass();
		sun.timePass();
	}

}
