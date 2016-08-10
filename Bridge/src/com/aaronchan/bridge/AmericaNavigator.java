package com.aaronchan.bridge;

public class AmericaNavigator extends Navigator {

	public AmericaNavigator(SatelliteNavigationSystem satelliteNavigationSystem) {
		super(satelliteNavigationSystem);
	}

	@Override
	public void navigate(String place) {
		System.out.println("Hi I'm a navigator from USA," + satelliteNavigationSystem.navigate(place));
	}

}
