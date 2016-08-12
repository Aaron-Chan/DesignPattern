package com.aaronchan.mediator.exampleA;

import java.util.ArrayList;
import java.util.List;

public class Show {
	private final List<Role> mRoles;

	public Show() {
		mRoles = new ArrayList<>();
	}
	
	
	

	public void addRole(Role role) {
		mRoles.add(role);
		role.joinShow(this);
	}
}
