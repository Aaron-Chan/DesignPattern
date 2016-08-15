package com.aaronchan.iterator;

public class Item {
	private String name;
	private ItemType itemType;
	public Item(String name, ItemType itemType) {
		super();
		this.name = name;
		this.itemType = itemType;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public ItemType getItemType() {
		return itemType;
	}
	public void setItemType(ItemType itemType) {
		this.itemType = itemType;
	}
	@Override
	public String toString() {
		return "Item name:" + name + ", itemType:" + itemType ;
	}
	
	
}
