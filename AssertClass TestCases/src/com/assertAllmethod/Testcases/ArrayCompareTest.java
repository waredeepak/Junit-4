package com.assertAllmethod.Testcases;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class ArrayCompareTest {

	@Test
	public void test() {
		// fail("Not yet implemented");

		int[] number = { 12, 3, 4, 1 };
		int[] expected = { 1, 3, 4, 12 };

		Arrays.sort(number);
		// assertEquals(expected, number);
		assertArrayEquals(expected, number);

	}

	@Test(expected = NullPointerException.class)
	public void testNullPointerException() {
		int[] number = null;
		Arrays.sort(number);
	}

}
