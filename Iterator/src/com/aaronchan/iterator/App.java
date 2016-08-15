package com.aaronchan.iterator;

public class App {

	public static void main(String[] args) {
		SnackRepository snackRepository = new SnackRepository();
		Iterator iterator = snackRepository.iterator(ItemType.CAKE);
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		System.out.println("-------");
		
		Iterator cookieIterator = snackRepository.iterator(ItemType.COOKIE);
		while (cookieIterator.hasNext()) {
			System.out.println(cookieIterator.next());
		}

		System.out.println("-------");
		
		Iterator candyIterator = snackRepository.iterator(ItemType.CANDY);
		while (candyIterator.hasNext()) {
			System.out.println(candyIterator.next());
		}
		System.out.println("-------");
		
		Iterator drinkIterator = snackRepository.iterator(ItemType.DRINK);
		while (drinkIterator.hasNext()) {
			System.out.println(drinkIterator.next());
		}

	}

}
