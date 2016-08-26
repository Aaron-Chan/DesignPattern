package com.aaronchan.state;

public class App {

	public static void main(String[] args) {
		Cattle cattle = new Cattle();
		cattle.plow();
		cattle.timePass();
		cattle.plow();
		cattle.timePass();
		cattle.plow();
		cattle.timePass();
		cattle.plow();
	}

}
