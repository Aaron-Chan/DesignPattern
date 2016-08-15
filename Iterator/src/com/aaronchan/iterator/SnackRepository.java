package com.aaronchan.iterator;

import java.util.ArrayList;
import java.util.List;

public class SnackRepository {
	private List<Item> snacks;

	public SnackRepository() {
		super();
		snacks = new ArrayList<>();
		snacks.add(new Item("panpan", ItemType.CAKE));
		snacks.add(new Item("Huamei", ItemType.CAKE));
		snacks.add(new Item("Oreo", ItemType.COOKIE));
		snacks.add(new Item("Orion", ItemType.COOKIE));
		snacks.add(new Item("Kjeldsens", ItemType.COOKIE));
		snacks.add(new Item("Coca cola", ItemType.DRINK));
		snacks.add(new Item("Extra", ItemType.CANDY));
		snacks.add(new Item("Dove", ItemType.CANDY));
		snacks.add(new Item("Fujiya", ItemType.CANDY));
		snacks.add(new Item("Pensi cola", ItemType.DRINK));
		snacks.add(new Item("Wang lao ji", ItemType.DRINK));

	}

	public Iterator iterator(ItemType itemType) {
		return new SnackRepositoryIterator(snacks, itemType);
	}

}
