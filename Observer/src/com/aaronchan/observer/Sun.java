package com.aaronchan.observer;

import java.util.ArrayList;
import java.util.List;

public class Sun {
	private SunStateType stateType = SunStateType.RISE;
	private List<SunObserver> observers;

	public Sun() {
		super();
		observers = new ArrayList<>();
	}

	public void timePass() {
		if (stateType == SunStateType.RISE) {
			stateType = SunStateType.SUNSET;
		} else {
			stateType = SunStateType.RISE;
		}
		notifyObservers();
	}

	public void registerOberver(SunObserver sunObserver) {
		observers.add(sunObserver);
	}

	public void removeOberver(SunObserver sunObserver) {
		observers.remove(sunObserver);
	}

	private void notifyObservers() {
		for (SunObserver sunObserver : observers) {
			sunObserver.update(stateType);
		}
	}
}
