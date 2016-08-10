package com.aaronchan.bridge;

public class BDS implements SatelliteNavigationSystem {

	@Override
	public String navigate(String place) {
		return "BDS navigate to " + place;
	}

}
