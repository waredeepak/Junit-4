/*package com.StringUtilclass;

import javax.print.attribute.TextSyntax;

public class StringUtilsTestCases {
	private static byte[] BYTES_FIXTURE;

	private static final String STRING_FIXTURE = "ABC";

	{
		try {
			BYTES_FIXTURE = "abc".getBytes("US-ASCII");
		} catch (UnsupportedEncodingException e) {
			throw new IllegalArgumentException(e.toString());
		}
	}

	*//**
	 * We could make the constructor private but there does not seem to be a point
	 * to jumping through extra code hoops to restrict instantiation right now.
	 *//*
	public void testConstructor() {
		new StringUtils();
	}

	public void testGetBytesIso8859_1() throws UnsupportedEncodingException {
		String charsetName = "ISO-8859-1";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesIso8859_1(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	private void testGetBytesUnchecked(String charsetName) throws UnsupportedEncodingException {
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUnchecked(STRING_FIXTURE, charsetName);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUsAscii() throws UnsupportedEncodingException {
		String charsetName = "US-ASCII";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUsAscii(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUtf16() throws UnsupportedEncodingException {
		String charsetName = "UTF-16";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUtf16(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUtf16Be() throws UnsupportedEncodingException {
		String charsetName = "UTF-16BE";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUtf16Be(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUtf16Le() throws UnsupportedEncodingException {
		String charsetName = "UTF-16LE";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUtf16Le(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUtf8() throws UnsupportedEncodingException {
		String charsetName = "UTF-8";
		testGetBytesUnchecked(charsetName);
		byte[] expected = STRING_FIXTURE.getBytes(charsetName);
		byte[] actual = StringUtils.getBytesUtf8(STRING_FIXTURE);
		Assert.assertTrue(Arrays.equals(expected, actual));
	}

	public void testGetBytesUncheckedBadName() {
		try {
			StringUtils.getBytesUnchecked(STRING_FIXTURE, "UNKNOWN");
			Assert.fail("Expected " + IllegalStateException.class.getName());
		} catch (IllegalStateException e) {
			// Expected
		}
	}

	private void testNewString(String charsetName) throws UnsupportedEncodingException {
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newString(BYTES_FIXTURE, charsetName);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringBadEnc() {
		try {
			StringUtils.newString(BYTES_FIXTURE, "UNKNOWN");
			Assert.fail("Expected " + IllegalStateException.class.getName());
		} catch (IllegalStateException e) {
			// Expected
		}
	}

	public void testNewStringIso8859_1() throws UnsupportedEncodingException {
		String charsetName = "ISO-8859-1";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringIso8859_1(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringUsAscii() throws UnsupportedEncodingException {
		String charsetName = "US-ASCII";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringUsAscii(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringUtf16() throws UnsupportedEncodingException {
		String charsetName = "UTF-16";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringUtf16(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringUtf16Be() throws UnsupportedEncodingException {
		String charsetName = "UTF-16BE";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringUtf16Be(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringUtf16Le() throws UnsupportedEncodingException {
		String charsetName = "UTF-16LE";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringUtf16Le(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}

	public void testNewStringUtf8() throws UnsupportedEncodingException {
		String charsetName = "UTF-8";
		testNewString(charsetName);
		String expected = new String(BYTES_FIXTURE, charsetName);
		String actual = StringUtils.newStringUtf8(BYTES_FIXTURE);
		Assert.assertEquals(expected, actual);
	}
}*/