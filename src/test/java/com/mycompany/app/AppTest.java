package com.mycompany.app;

import java.util.ArrayList;
import java.util.Arrays;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

     public void testPass() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int array2[] = {1,2,3,4};
        String str = "a";
        int num = 2;
        assertEquals(new App().passGenerator(str,array2,array,num),"a3");
      }
  
      public void testLength() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int array2[] = {1,2,3,4};
        String str = "a";
        int num = 7;
        assertEquals(new App().passGenerator(str,array2,array,num),"");
      }
  
      public void testSecondLayer() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4,20));
        int array2[] = {1,2,3,4};
        String str = "a";
        int num = 4;
        assertEquals(new App().passGenerator(str,array2,array,num),"");
      }
  
      public void testNull() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        String str = "a";
        int num = 2;
        assertEquals(new App().passGenerator(str,null,array,num),"");
      }

      public void testStringEmpty() {
        ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4));
        int array2[] = {1,2,3,4};
        String str = "";
        int num = 2;
        assertEquals(new App().passGenerator(str,array2,array,num),"3");
      }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    /**
     * 
     */
    
  
}
