package com.aaronchan.mediator.exampleA;

public abstract class Role {
	private Show mShow;

	public void joinShow(Show show) {
		this.mShow = show;
	};

	public void act(Action action) {
		System.out.println(String.format("%1$s %2$s", this, action));
		if (mShow != null) {
			mShow.onRoleAction(this, action);
		}
	};

	public void angry(Role role) {
		System.out.println(String.format("%1$s %2$s at %3$s", this, "angry", role));
	}

	public void simle(Role role) {
		System.out.println(String.format("%1$s %2$s beause of %3$s", this, "simle", role));

	}

	public void comfort(Role role) {
		System.out.println(String.format("%1$s %2$s %3$s", this, "comfort", role));

	}

	@Override
	public abstract String toString();
}
