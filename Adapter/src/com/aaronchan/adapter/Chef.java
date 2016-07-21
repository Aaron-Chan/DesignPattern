package com.aaronchan.adapter;

public class Chef {
	public Food cook(FoodName foodName) {
		System.out.println("Chef cook " + foodName);
		return new Food(foodName.toString());
	}
}
