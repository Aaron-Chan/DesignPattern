package com.aaronchan.factory.method.mulit;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aaronchan.factory.method.mulit.example.CocaCola;
import com.aaronchan.factory.method.mulit.example.Cola;
import com.aaronchan.factory.method.mulit.example.ColaFactory;
import com.aaronchan.factory.method.mulit.example.PensiCola;
import com.aaronchan.factory.method.mulit.example.Size;

public class ColaFactoryTest {
	ColaFactory colaFactory;

	@Before
	public void setUp() {
		colaFactory = new ColaFactory();
	}

	@Test
	public void testProducePensiCola() {
		Cola pensiCola1 = colaFactory.producePensiCola(Size.BOTTLING);
		Cola pensiCola2 = colaFactory.producePensiCola(Size.CANNED);

		assertTrue(pensiCola1 instanceof PensiCola);
		assertTrue(pensiCola2 instanceof PensiCola);
	}

	@Test
	public void testProduceCocaCola() {
		Cola cocaCola1 = colaFactory.produceCocaCola(Size.BOTTLING);
		Cola cocaCola2 = colaFactory.produceCocaCola(Size.CANNED);

		assertTrue(cocaCola1 instanceof CocaCola);
		assertTrue(cocaCola2 instanceof CocaCola);
	}

}
