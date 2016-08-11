package com.aaronchan.proxy;

public class MagicPotionStore {
	private static final String ARGOT = "excited";

	public MagicPotion getMaicPotion(String argot) {
		MagicPotion magicPotion = null;
		if (ARGOT.equals(argot)) {
			magicPotion = new MagicPotion();
		}
		return magicPotion;
	}
}
