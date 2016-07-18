package com.aaronchan.decorator;

public class RunningMan implements Runner {

	@Override
	public int run() {
		return 10;
	}

	@Override
	public void rst() {
		System.out.println("RunningMan rst");
	}

}
