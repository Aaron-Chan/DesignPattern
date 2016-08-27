package com.aaronchan.abstactfactory;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aaronchan.abstactfactory.example.App;

public class AppTest {

	@Test
	public void test() {
		App app = new App();
		String[] args = {};
		app.main(args);
	}

}
