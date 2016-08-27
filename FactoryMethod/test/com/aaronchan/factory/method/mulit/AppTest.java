package com.aaronchan.factory.method.mulit;

import org.junit.Test;

import com.aaronchan.factory.method.mulit.example.MultiFactoryApp;

public class AppTest {
	@Test
	public void test() {
		MultiFactoryApp app = new MultiFactoryApp();
		String[] args = {};
		app.main(args);
	}
}
