package com.assertAllmethod.Testcases;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class BeforeAferTest {

	@BeforeClass
	public static void beforeClass() {
		System.out.println(" Before class Test");
	}

	@Before
	public void setUp() {
		System.out.println("  in Before test");
	}

	@Test
	public void test() {
		// fail("Not yet implemented");
		System.out.println(" test 1 executed");
	}

	@Test
	public void test2() {
		// fail("Not yet implemented");
		System.out.println(" test 2 executed");
	}

	@After
	public void teardown() {

		System.out.println(" after test executed");
	}

	@AfterClass
	public static void afterClass() {
		System.out.println(" After class");
	}

}
