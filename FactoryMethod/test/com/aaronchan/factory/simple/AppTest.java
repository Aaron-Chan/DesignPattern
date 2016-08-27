package com.aaronchan.factory.simple;

import org.junit.Test;

import com.aaronchan.factory.method.simple.example.App;

public class AppTest {
	@Test
	public void test() {
		App app = new App();
		String[] args = {};
		app.main(args);
	}
}
