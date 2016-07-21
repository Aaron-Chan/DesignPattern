package com.aaronchan.bridge;

public class GPS implements SatelliteNavigationSystem {

	@Override
	public String navigate(String place) {
		return "GPS navigate to " + place;
	}

}
