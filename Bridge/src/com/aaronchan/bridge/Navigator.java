package com.aaronchan.bridge;

public abstract class Navigator {
	protected SatelliteNavigationSystem satelliteNavigationSystem;

	public abstract void navigate(String place);

	public Navigator(SatelliteNavigationSystem satelliteNavigationSystem) {
		super();
		this.satelliteNavigationSystem = satelliteNavigationSystem;
	}

}
