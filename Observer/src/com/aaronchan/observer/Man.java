package com.aaronchan.observer;

public class Man extends Animal {

	@Override
	public void update(SunStateType stateType) {
		switch (stateType) {
		case SUNSET:
			realese();
			break;
		case RISE:
			work();
			break;
		default:
			break;
		}

	}

	@Override
	protected void realese() {
		System.out.println("Man realese");
	}

	@Override
	protected void work() {
		System.out.println("Man work");
	}

}
