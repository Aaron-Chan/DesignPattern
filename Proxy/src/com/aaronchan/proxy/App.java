package com.aaronchan.proxy;

public class App {

	public static void main(String[] args) {
		MagicPotionStoreProxy magicPotionStoreProxy = new MagicPotionStoreProxy();
		MagicPotion maicPotion = magicPotionStoreProxy.getMaicPotion(5);
		System.out.println(maicPotion);
	}

}
