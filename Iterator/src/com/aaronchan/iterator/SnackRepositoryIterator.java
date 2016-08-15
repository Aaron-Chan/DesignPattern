package com.aaronchan.iterator;

import java.util.List;

public class SnackRepositoryIterator implements Iterator {
	private List<Item> snacks;
	private ItemType itemType;
	private int index = -1;

	public SnackRepositoryIterator(List<Item> snacks, ItemType itemType) {
		super();
		this.snacks = snacks;
		this.itemType = itemType;
	}

	@Override
	public boolean hasNext() {
		boolean hasNext = false;
		if (findNext() != -1) {
			hasNext = true;
		}
		return hasNext;
	}

	private int findNext() {
		int tempIndex = index;
		while (tempIndex < snacks.size()) {
			tempIndex++;
			if (tempIndex >= snacks.size()) {
				tempIndex = -1;
				break;
			}
			if (snacks.get(tempIndex).getItemType() == itemType) {
				break;
			}

		}
		return tempIndex;
	}

	@Override
	public Item next() {
		Item next = null;
		index = findNext();
		if (index != -1) {
			next = snacks.get(index);
		}
		return next;
	}

}
