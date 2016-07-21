package com.aaronchan.composite;

import java.util.ArrayList;
import java.util.List;

public class Leader extends Employee {
	public Leader(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	private List<Employee> suboridnates = new ArrayList<>();

	@Override
	public void addSubordinate(Employee employee) {
		suboridnates.add(employee);

	}

	@Override
	public void removeSubOrdinate(Employee employee) {
		suboridnates.remove(employee);
	}

	@Override
	public void work() {
		if (!suboridnates.isEmpty()) {
			System.out.println(name + " assign work to suboridnates");
			for (Employee employee : suboridnates) {
				employee.work();
			}
		} else {
			System.out.println(name + " works");
		}

	}

}
