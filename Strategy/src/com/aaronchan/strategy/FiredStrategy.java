package com.aaronchan.strategy;

import java.net.CookiePolicy;
import java.net.HttpCookie;
import java.net.URI;

public class FiredStrategy implements  CookStrategy {

	@Override
	public void cook(Chicken chicken) {
		System.out.println(String.format(" fired %s ", chicken));
	}

}
