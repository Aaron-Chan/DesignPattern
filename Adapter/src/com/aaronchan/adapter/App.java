package com.aaronchan.adapter;

public class App {

	public static void main(String[] args) {
		FoodDeliveryService foodDeliveryService = new Restaurant();
		foodDeliveryService.order(FoodName.BEEF_NOODLES);
	}

}
