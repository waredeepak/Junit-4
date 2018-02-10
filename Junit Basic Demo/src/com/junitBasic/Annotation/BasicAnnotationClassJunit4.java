package com.junitBasic.Annotation;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class BasicAnnotationClassJunit4 {

	// Run once, e.g. Database connection, connection pool
	@BeforeClass
	public static void runOnceBeforeClass() {
		System.out.println("@BeforeClass - runOnceBeforeClass");
	}

	// Run once, e.g close connection, cleanup
	@AfterClass
	public static void runOnceAfterClass() {
		System.out.println("@AfterClass - runOnceAfterClass");
	}

	// Should rename to @BeforeTestMethod
	// e.g. Creating an similar object and share for all @Test
	@Before
	public void runBeforeTestMethod() {
		System.out.println("@Before - runBeforeTestMethod");
	}

	// Should rename to @AfterTestMethod
	@After
	public void runAfterTestMethod() {
		System.out.println("@After - runAfterTestMethod");
	}

	@Ignore
	public void TestIgnoreMethod()
	{
		System.out.println(" @Test - Ignore method");
	}
	
	@Test
	public void test_method_1() {
		System.out.println("@Test - test_method_1");
	}

	@Test
	public void test_method_2() {
		System.out.println("@Test - test_method_2");
	}
	
	@Test(timeout = 100)
	public void TestTimeOutMethod()
	{
		System.out.println("Test - time out 100 milesecond method if fails that  speciall used for file IO");
	}
	
	/*Output
	@BeforeClass - runOnceBeforeClass
	@Before - runBeforeTestMethod
	@Test - test_method_1
	@After - runAfterTestMethod
	@Before - runBeforeTestMethod
	@Test - test_method_2
	@After - runAfterTestMethod
	@AfterClass - runOnceAfterClass*/

}
