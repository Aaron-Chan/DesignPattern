package com.aaronchan.factory.method.stati;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.aaronchan.factory.method.stati.example.Color;
import com.aaronchan.factory.method.stati.example.GodFactory;
import com.aaronchan.factory.method.stati.example.Human;
import com.aaronchan.factory.method.stati.example.Man;
import com.aaronchan.factory.method.stati.example.Woman;

public class GodFactoryTest {

	@Test
	public void testProduceMan() {
		Human blackMan = GodFactory.produceMan(Color.BLACK);
		assertTrue(blackMan instanceof Man);
		
		Human whiteMan = GodFactory.produceMan(Color.WHITE);
		assertTrue(whiteMan instanceof Man);
		
		Human yellowMan = GodFactory.produceMan(Color.YELLOW);
		assertTrue(yellowMan instanceof Man);
		
	}

	@Test
	public void testProduceWoman() {
		Human blackWoman = GodFactory.produceWoman(Color.BLACK);
		assertTrue(blackWoman instanceof Woman);
		
		Human whiteWoman = GodFactory.produceWoman(Color.WHITE);
		assertTrue(whiteWoman instanceof Woman);
		
		Human yellowWoman = GodFactory.produceWoman(Color.YELLOW);
		assertTrue(yellowWoman instanceof Woman);
	}

}
