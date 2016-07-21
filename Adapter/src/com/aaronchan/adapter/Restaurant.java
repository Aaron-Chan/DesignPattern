package com.aaronchan.adapter;

public class Restaurant implements FoodDeliveryService {
	private Deliveryman deliveryman;
	private Chef chef;

	@Override
	public void order(FoodName foodName) {
		Food food = chef.cook(foodName);
		deliveryman.delivery(food);
	}

	public Restaurant() {
		super();
		this.deliveryman = new Deliveryman();
		this.chef = new Chef();
	}

	public Deliveryman getDeliveryman() {
		return deliveryman;
	}

	public void setDeliveryman(Deliveryman deliveryman) {
		this.deliveryman = deliveryman;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}

}
