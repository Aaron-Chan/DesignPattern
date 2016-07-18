package com.aaronchan.builder.simple;

import static org.junit.Assert.*;

import org.junit.Test;

public class HeroTest {

	@Test(expected = IllegalArgumentException.class)
	public void testMissingName() {
		Hero hero = new Hero.Builder(null, Profession.ARCHER).build();
	}

	@Test(expected = IllegalArgumentException.class)
	public void testMissingProfession() {
		Hero hero = new Hero.Builder("jack", null).build();
	}

	@Test
	public void testBuildHero() throws Exception {
		Hero hero = new Hero.Builder("curry", Profession.WARRIOR).withBodyType(BodyType.MEDIUM)
				.withHairStyle(HairStyle.SHORT).build();
		assertNotNull(hero);
		assertEquals(BodyType.MEDIUM, hero.getBodyType());
		assertEquals(Profession.WARRIOR, hero.getProfession());
		assertEquals(HairStyle.SHORT, hero.getHairStyle());
	}

}
