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
 * 参数化测试 该测试应该以类的形式单独出来 1.@RunWith(Parameterized.class)
 *  2.在构造函数传入被测数据和期待数据
 * {@link #PrototypeTest(Prototype, String)}
 *  3.提供被测试的数据数组{@link #data()}
 * 4.提供一个@test的测试方法 {@link #testPrototype()}
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
