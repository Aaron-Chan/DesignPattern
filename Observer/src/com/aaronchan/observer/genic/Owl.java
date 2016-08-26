package com.aaronchan.observer.genic;

import com.aaronchan.observer.SunStateType;

public class Owl implements GAnimal {

	@Override
	public void update(GSun subject, SunStateType argument) {
		switch (argument) {
		case SUNSET:
			bleating();
			break;
		case RISE:
			realese();
			break;
		default:
			break;
		}
	}

	private void realese() {
		System.out.println("Owl realese");
	}

	private void bleating() {
		System.out.println("Owl bleating");

	}

}
