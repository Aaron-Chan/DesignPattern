package com.aaronchan.proxy;

public class MagicPotionStoreProxy {
	private MagicPotionStore mMagicPotionStore = new MagicPotionStore();

	public MagicPotion getMaicPotion(int money) {
		MagicPotion maicPotion = null;
		if (money != 0) {
			maicPotion = mMagicPotionStore.getMaicPotion("excited");
		} else {
			throw new IllegalArgumentException("no money,no way!");
		}
		return maicPotion;
	}
}
