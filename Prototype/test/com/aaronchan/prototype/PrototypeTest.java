package com.aaronchan.prototype;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;

/**
 * ���������� �ò���Ӧ���������ʽ�������� 1.@RunWith(Parameterized.class)
 *  2.�ڹ��캯�����뱻�����ݺ��ڴ�����
 * {@link #PrototypeTest(Prototype, String)}
 *  3.�ṩ�����Ե���������{@link #data()}
 * 4.�ṩһ��@test�Ĳ��Է��� {@link #testPrototype()}
 * 
 * @author AaronChan
 *
 */

@RunWith(Parameterized.class)
public class PrototypeTest {

	@Parameterized.Parameters
	public static Collection<Object[]> data() {
		return Arrays.asList(new Object[] { new SassonShampoo(), "SassonShampoo" },
				new Object[] { new RejoiceShampoo(), "RejoiceShampoo" },
				new Object[] { new CrestToothpaste(), "CrestToothpaste" },
				new Object[] { new DarlieToothpaste(), "DarlieToothpaste" });
	}

	private final Prototype testedPrototype;

	private final String expectedToString;

	public PrototypeTest(final Prototype testedPrototype, final String expectedToString) {
		this.expectedToString = expectedToString;
		this.testedPrototype = testedPrototype;
	}

	@Test
	public void testPrototype() throws Exception {
		assertEquals(this.expectedToString, this.testedPrototype.toString());

		final Object clone = this.testedPrototype.clone();
		assertNotNull(clone);
		assertNotSame(clone, this.testedPrototype);
		assertSame(this.testedPrototype.getClass(), clone.getClass());
	}

}
