package com.aaronchan.bridge;

public class ChinaNavigator extends Navigator {

	public ChinaNavigator(SatelliteNavigationSystem satelliteNavigationSystem) {
		super(satelliteNavigationSystem);
	}

	@Override
	public void navigate(String place) {
		System.out.println("Hi I'm a navigator from China," + satelliteNavigationSystem.navigate(place));
	}

}
