package com.aaronchan.factory.simple;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aaronchan.factory.method.simple.example.AndroidPhone;
import com.aaronchan.factory.method.simple.example.IOSPhone;
import com.aaronchan.factory.method.simple.example.MobilePhone;
import com.aaronchan.factory.method.simple.example.MobilePhoneFactory;
import com.aaronchan.factory.method.simple.example.OS;

public class MobilePhoneFactoryTest {

	@Test
	public void testProduce() {
		MobilePhoneFactory factory = new MobilePhoneFactory();

		MobilePhone android = factory.produce("android");
		assertNotNull(android);
		assertTrue(android instanceof AndroidPhone);
		assertEquals(OS.Android, android.getOs());

		MobilePhone ios = factory.produce("ios");
		assertNotNull(ios);
		assertTrue(ios instanceof IOSPhone);
		assertEquals(OS.IOS, ios.getOs());

		MobilePhone phone = factory.produce("xxx");
		assertNull(phone);

	}

}
