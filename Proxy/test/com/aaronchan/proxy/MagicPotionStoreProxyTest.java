package com.aaronchan.proxy;

import static org.junit.Assert.*;

import org.junit.Test;

public class MagicPotionStoreProxyTest {

	

	@Test(expected = IllegalArgumentException.class)
	public void testGetMaicPotionException() {
		MagicPotionStoreProxy magicPotionStoreProxy =new  MagicPotionStoreProxy();
		magicPotionStoreProxy.getMaicPotion(0);
	}
	@Test
	public void testGetMaicPotion() {
		MagicPotionStoreProxy magicPotionStoreProxy =new  MagicPotionStoreProxy();
		MagicPotion maicPotion = magicPotionStoreProxy.getMaicPotion(10);
		assertNotNull(maicPotion);
	}
}
