package com.assertAllmethod.Testcases;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.assertAllmethod.MyUnitTest;

public class MyUnittestCases {

	MyUnitTest myUnit = null;

	@Before
	public void setUp() {
		myUnit = new MyUnitTest();
	}

	@Test
	public void testAssertEquals() {
		// fail("Not yet implemented");

		String s1 = "Deepak";
		String s2 = "ware";
		String result = myUnit.concatnation(s1, s2);
		System.out.println(result);
		assertEquals("Deepakware", result);
	}
	
	@Test
    public void testAssertArrayEquals() {
		
		//assume that the below array represents expected result
        String[] expectedOutput = {"apple", "mango", "grape"};
        //assuem that the below array is returned from the method 
        //to be tested.
        String[] methodOutput = {"apple", "mango", "grape"};
        assertArrayEquals(expectedOutput, methodOutput);
    }
	
	
	

}
