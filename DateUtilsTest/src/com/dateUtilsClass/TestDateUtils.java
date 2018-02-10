/*package com.dateUtilsClass;

public class TestDateUtils {
	public TestDateUtils(String testName) {
        super(testName);
    }

    public static void main(String args[]) {
        String[] testCaseName = { TestDateUtils.class.getName() };
        junit.textui.TestRunner.main(testCaseName);
    }

    public static Test suite() {
        return new TestSuite(TestDateUtils.class);
    }

    public void testBasicDateParse() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(2005, Calendar.OCTOBER, 14, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date1 = calendar.getTime(); 
        
        String[] formats = new String[] {
                DateUtils.PATTERN_RFC1123
                };
        Date date2 = DateUtils.parseDate("Fri, 14 Oct 2005 00:00:00 GMT", formats, null);
        assertEquals(date1, date2);
        date2 = DateUtils.parseDate("Fri, 14 Oct 2005 00:00:00 GMT", formats);
        assertEquals(date1, date2);
        date2 = DateUtils.parseDate("Fri, 14 Oct 2005 00:00:00 GMT");
        assertEquals(date1, date2);
    }

    public void testInvalidInput() throws Exception {
        try {
            DateUtils.parseDate(null, null, null);
            fail("IllegalArgumentException should habe been thrown");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            DateUtils.parseDate("Fri, 14 Oct 2005 00:00:00 GMT", new String[] {}, null);
            fail("DateParseException should habe been thrown");
        } catch (DateParseException ex) {
            // expected
        }
        try {
            DateUtils.formatDate(null);
            fail("IllegalArgumentException should habe been thrown");
        } catch (IllegalArgumentException ex) {
            // expected
        }
        try {
            DateUtils.formatDate(new Date(), null);
            fail("IllegalArgumentException should habe been thrown");
        } catch (IllegalArgumentException ex) {
            // expected
        }
    }
    
    public void testTwoDigitYearDateParse() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(2005, Calendar.OCTOBER, 14, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date1 = calendar.getTime(); 
        
        String[] formats = new String[] {
                DateUtils.PATTERN_RFC1036
                };
        Date date2 = DateUtils.parseDate("Friday, 14-Oct-05 00:00:00 GMT", formats, null);
        assertEquals(date1, date2);

        calendar.set(1900, Calendar.JANUARY, 0, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date startDate = calendar.getTime(); 

        calendar.set(1905, Calendar.OCTOBER, 14, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        date1 = calendar.getTime(); 
        
        date2 = DateUtils.parseDate("Friday, 14-Oct-05 00:00:00 GMT", formats, startDate);
        assertEquals(date1, date2);
    }

    public void testParseQuotedDate() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(2005, Calendar.OCTOBER, 14, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date1 = calendar.getTime(); 
        
        String[] formats = new String[] {
                DateUtils.PATTERN_RFC1123
                };
        Date date2 = DateUtils.parseDate("'Fri, 14 Oct 2005 00:00:00 GMT'", formats);
        assertEquals(date1, date2);
    }

    public void testBasicDateFormat() throws Exception {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(DateUtils.GMT);
        calendar.set(2005, Calendar.OCTOBER, 14, 0, 0, 0);
        calendar.set(Calendar.MILLISECOND, 0);
        Date date = calendar.getTime(); 
        
        assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date));
        assertEquals("Fri, 14 Oct 2005 00:00:00 GMT", DateUtils.formatDate(date, DateUtils.PATTERN_RFC1123));
    }

    public void testConstructor() {
        new DateParseException();
        new DateParseException("Oppsie");
    }
}*/