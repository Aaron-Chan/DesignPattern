package com.aaronchan.mediator.exampleA;

public abstract class Role {
	private Show mShow;

	public void joinShow(Show show) {
		this.mShow = show;
	};

	public abstract void act(Action action);

	@Override
	public abstract String toString();
}
