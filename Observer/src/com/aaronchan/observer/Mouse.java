package com.aaronchan.observer;

public class Mouse extends Animal {

	@Override
	public void update(SunStateType stateType) {
		switch (stateType) {
		case SUNSET:
			work();
			break;
		case RISE:
			realese();
			break;
		default:
			break;
		}
	}

	@Override
	protected void realese() {
		System.out.println("Mouse realese");
	}

	@Override
	protected void work() {
		System.out.println("Mouse work");
	}

}
