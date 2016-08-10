package com.aaronchan.facade;

public class App {

	public static void main(String[] args) {
		Restaurant restaurant = new Restaurant();
		restaurant.order(FoodName.BEEF_NOODLES);
	}

}
