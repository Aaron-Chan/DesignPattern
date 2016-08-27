package com.aaronchan.abstactfactory;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.aaronchan.abstactfactory.example.ArimaFactory;
import com.aaronchan.abstactfactory.example.ArimaPhone;
import com.aaronchan.abstactfactory.example.ArimaTablet;
import com.aaronchan.abstactfactory.example.ArimaUDisk;
import com.aaronchan.abstactfactory.example.FoxconnFactory;
import com.aaronchan.abstactfactory.example.FoxconnPhone;
import com.aaronchan.abstactfactory.example.FoxconnTablet;
import com.aaronchan.abstactfactory.example.FoxconnUDisk;
import com.aaronchan.abstactfactory.example.IACFactory;
import com.aaronchan.abstactfactory.example.IACPhone;
import com.aaronchan.abstactfactory.example.IACTablet;
import com.aaronchan.abstactfactory.example.IACUDisk;
import com.aaronchan.abstactfactory.example.Phone;
import com.aaronchan.abstactfactory.example.Tablet;
import com.aaronchan.abstactfactory.example.UDisk;

public class AbstractFactoryTest {
	private ArimaFactory arimaFactory;
	private FoxconnFactory foxconnFactory;
	private IACFactory iACFactory;

	@Before
	public void setUp() {
		arimaFactory = new ArimaFactory();
		foxconnFactory = new FoxconnFactory();
		iACFactory = new IACFactory();
	}

	@Test
	public void phone() {
		Phone producePhone = arimaFactory.producePhone();
		assertTrue(producePhone instanceof ArimaPhone);
		assertEquals(ArimaPhone.DESCRIPTION, producePhone.getDescription());

		Phone producePhone2 = foxconnFactory.producePhone();
		assertTrue(producePhone2 instanceof FoxconnPhone);
		assertEquals(FoxconnPhone.DESCRIPTION, producePhone2.getDescription());

		Phone producePhone3 = iACFactory.producePhone();
		assertTrue(producePhone3 instanceof IACPhone);
		assertEquals(IACPhone.DESCRIPTION, producePhone3.getDescription());
	}

	@Test
	public void tablet() {
		Tablet tablet = arimaFactory.produceTablet();
		assertTrue(tablet instanceof ArimaTablet);
		assertEquals(ArimaTablet.DESCRIPTION, tablet.getDescription());

		Tablet tablet2 = foxconnFactory.produceTablet();
		assertTrue(tablet2 instanceof FoxconnTablet);
		assertEquals(FoxconnTablet.DESCRIPTION, tablet2.getDescription());

		Tablet tablet3 = iACFactory.produceTablet();
		assertTrue(tablet3 instanceof IACTablet);
		assertEquals(IACTablet.DESCRIPTION, tablet3.getDescription());
	}

	@Test
	public void uDisk() {
		UDisk udisk = arimaFactory.produceUDisk();
		assertTrue(udisk instanceof ArimaUDisk);
		assertEquals(ArimaUDisk.DESCRIPTION, udisk.getDescription());

		UDisk udisk2 = foxconnFactory.produceUDisk();
		assertTrue(udisk2 instanceof FoxconnUDisk);
		assertEquals(FoxconnUDisk.DESCRIPTION, udisk2.getDescription());

		UDisk udisk3 = iACFactory.produceUDisk();
		assertTrue(udisk3 instanceof IACUDisk);
		assertEquals(IACUDisk.DESCRIPTION, udisk3.getDescription());
	}
}
