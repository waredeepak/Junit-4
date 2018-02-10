package com.assertAllmethod.Testcases;

import static org.junit.Assert.*;


import org.junit.Before;
import org.junit.Test;

import com.assertAllmethod.StringHelper;

public class StringHelperTest {
	
	StringHelper actual ;
	
	@Before
	public void before()
	{
		actual =  new StringHelper();
	}

	@Test
	public void truncateAInFirst2Positions() {
		// fail("Not yet implemented");

		// Input
		// AACD - CD,ACD -CD,CDEF-CDEF,CDAA - CDAA

		// SIMPL WAY
	 /*	StringHelper helper = new StringHelper();
		String actual = helper.truncateAInFirst2Positions("AACD");
		String expected = "CD";
		assertEquals(expected, actual);
		// expected ,actual
     */
		// after Inline

		//String actual = new StringHelper().truncateAInFirst2Positions("AACD");
		//String expected = "CD";
		assertEquals("CD", actual.truncateAInFirst2Positions("AACD"));
		// expected ,actual
	}

	@Test
	public void areFirstAndLastTwoCharactersTheSame()
	{
		        /* Boolean actualValue = actual.areFirstAndLastTwoCharactersTheSame("ABCD");
				Boolean  expectedValue  = false;
				assertEquals(expectedValue, actualValue);*/
		
		// after inline--Righ_actual-refactor-inline
		// inline for actual value
		   /*Boolean  expectedValue  = false;
			assertEquals(expectedValue, actual.areFirstAndLastTwoCharactersTheSame("ABCD"));
			*/
			// inline for expected value
			assertEquals(false, actual.areFirstAndLastTwoCharactersTheSame("ABCD"));
	
			
	}
	
}
