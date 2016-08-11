package com.aaronchan.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagicPotionStoreTest {

	@Test
	public void testGetMaicPotionNull() {
		MagicPotion maicPotion = null;
		MagicPotionStore magicPotionStore = new MagicPotionStore();
		maicPotion = magicPotionStore.getMaicPotion("excited!");
		assertNull(maicPotion);
	}

	@Test
	public void testGetMaicPotion() {
		MagicPotion maicPotion = null;
		MagicPotionStore magicPotionStore = new MagicPotionStore();
		maicPotion = magicPotionStore.getMaicPotion("excited");
		assertNotNull(maicPotion);

	}

}
