package com.aaronchan.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class Employee {
	protected String name;

	public abstract void addSubordinate(Employee employee);

	public abstract void removeSubOrdinate(Employee employee);

	public abstract void work();

	public Employee(String name) {
		super();
		this.name = name;
	}

}
