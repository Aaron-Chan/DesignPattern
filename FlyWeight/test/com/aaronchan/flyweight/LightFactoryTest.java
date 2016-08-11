package com.aaronchan.flyweight;

import static org.junit.Assert.*;

import org.junit.Test;

public class LightFactoryTest {

	@Test
	public void test() {
		LightFactory factory = new LightFactory();
		Light light1 = factory.getLight(LightType.BLUE);
		Light light2 = factory.getLight(LightType.BLUE);
		assertTrue(light1 == light2);
	}

}
