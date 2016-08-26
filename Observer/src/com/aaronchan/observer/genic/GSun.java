package com.aaronchan.observer.genic;

import com.aaronchan.observer.SunStateType;

public class GSun extends Observable<GSun, GAnimal, SunStateType> {
	private SunStateType stateType = SunStateType.RISE;

	public void timePass() {
		if (stateType == SunStateType.RISE) {
			stateType = SunStateType.SUNSET;
		} else {
			stateType = SunStateType.RISE;
		}
		notifyObservers(stateType);
	}
}
