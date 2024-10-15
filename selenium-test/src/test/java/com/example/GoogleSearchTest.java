package com.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GoogleSearchTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GoogleSearchTest(String testName) // Changed from AppTest to GoogleSearchTest
    {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite(GoogleSearchTest.class); // Changed from AppTest.class to GoogleSearchTest.class
    }

    /**
     * Rigorous Test :-)
     */
    public void testApp()
    {
        assertTrue(true);
    }
}
