package uscis;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class ConversionTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public ConversionTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( ConversionTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    @Test
	public void testCelisius(){
		double result = Conversion.celsius(65);
		assertTrue(18.333333333333332 == result);
	}
	

	@Test
	public void testFahrenheit(){
		double result = Conversion.fahrenheit(65);
		assertTrue(149.0 == result);
	}
}
