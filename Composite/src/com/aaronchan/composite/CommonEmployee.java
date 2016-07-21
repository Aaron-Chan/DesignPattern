package com.aaronchan.composite;

public class CommonEmployee extends Employee {

	public CommonEmployee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void addSubordinate(Employee employee) {
		System.out.println("CommonEmployee can't add subOrdinate");

	}

	@Override
	public void removeSubOrdinate(Employee employee) {
		System.out.println("CommonEmployee can't remove subOrdinate");

	}

	@Override
	public void work() {
		System.out.println(name + "  works");
	}

}
