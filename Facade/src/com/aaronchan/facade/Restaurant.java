package com.aaronchan.facade;

public class Restaurant  {
	private Deliveryman deliveryman;
	private Chef chef;
	private Waiter waiter;


	public void order(FoodName foodName) {
		Food food = chef.cook(foodName);
		waiter.pack(food);
		deliveryman.delivery(food);
	}

	public Restaurant() {
		super();
		this.deliveryman = new Deliveryman();
		this.chef = new Chef();
		this.waiter = new Waiter();
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
