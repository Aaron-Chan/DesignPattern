package com.aaronchan.factory.method.stati;

import org.junit.Test;

import com.aaronchan.factory.method.stati.example.StaticApp;

public class AppTest {
	@Test
	public void test() {
		StaticApp app = new StaticApp();
		String[] args = {};
		app.main(args);
	}
}
