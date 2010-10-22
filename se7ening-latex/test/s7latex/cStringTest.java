/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package s7latex;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class cStringTest {

    public cStringTest() {
    }

    @org.junit.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.junit.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    /**
     * Test of getString method, of class cString.
     */
    @org.junit.Test
    public void testGetString() {
        System.out.println("getString");
        cString instance = new cString("");
        String expResult = "";
        String result = instance.getString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setString method, of class cString.
     */
    @org.junit.Test
    public void testSetString() {
        System.out.println("setString");
        String value = "";
        cString instance = new cString();
        instance.setString(value);
        assertEquals(value, instance.getString());
    }

    /**
     * Test of toString method, of class cString.
     */
    @org.junit.Test
    public void testToString() {
        System.out.println("toString");
        cString instance = new cString();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTEX method, of class cString.
     */
    @org.junit.Test
    public void testGetTEX() {
        System.out.println("getTEX");
        String ident = "";
        cString instance = new cString();
        String expResult = "";
        String result = instance.getTEX(ident);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectByKey method, of class cString.
     */
    @org.junit.Test
    public void testGetObjectByKey() {
        System.out.println("getObjectByKey");
        String p_key = "";
        cString instance = new cString();
        cObject expResult = null;
        cObject result = instance.getObjectByKey(p_key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}