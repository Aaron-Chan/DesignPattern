package com.aaronchan.adapter;

public class GunWeapon implements Weapon {
	private Gun gun;

	@Override
	public void attack() {
		gun.shot();
	}

	@Override
	public String name() {
		return gun.name();
	}

	public GunWeapon() {
		super();
		this.gun = new Gun();
	}

}
