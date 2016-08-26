package com.aaronchan.observer.genic;

import com.aaronchan.observer.SunStateType;

public class Dog implements GAnimal {

	@Override
	public void update(GSun subject, SunStateType argument) {
		switch (argument) {
		case SUNSET:
			realese();
			break;
		case RISE:
			play();
			break;
		default:
			break;
		}

	}

	private void play() {
		System.out.println("Dog play");
	}

	private void realese() {
		System.out.println("Dog realese");
	}

}
