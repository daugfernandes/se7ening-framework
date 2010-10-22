/*
 *
 *     Copyright (C) 2010  David Fernandes
 *
 *                         Rua da Quinta Amarela, 60
 *                         4475-663 MAIA
 *                         PORTUGAL
 *
 *                         <daugfernandes@aim.com>
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU General Public License as published by
 *     the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU General Public License for more details.
 *
 *     You should have received a copy of the GNU General Public License
 *     along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 */

package s7latex;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author david
 */
public class cDocumentTest {

    public cDocumentTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of getBody method, of class cDocument.
     */
    @Test
    public void testGetBody() {
        System.out.println("getBody");
        cDocument instance = new cDocument();
        cBody expResult = null;
        cBody result = instance.getBody();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBody method, of class cDocument.
     */
    @Test
    public void testSetBody() {
        System.out.println("setBody");
        cBody value = null;
        cDocument instance = new cDocument();
        instance.setBody(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPreamble method, of class cDocument.
     */
    @Test
    public void testGetPreamble() {
        System.out.println("getPreamble");
        cDocument instance = new cDocument();
        cPreamble expResult = null;
        cPreamble result = instance.getPreamble();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPreamble method, of class cDocument.
     */
    @Test
    public void testSetPreamble() {
        System.out.println("setPreamble");
        cPreamble value = null;
        cDocument instance = new cDocument();
        instance.setPreamble(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class cDocument.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        cDocument instance = new cDocument();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTEX method, of class cDocument.
     */
    @Test
    public void testGetTEX() {
        System.out.println("getTEX");
        String ident = "";
        cDocument instance = new cDocument();
        String expResult = "";
        String result = instance.getTEX(ident);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getObjectByKey method, of class cDocument.
     */
    @Test
    public void testGetObjectByKey() {
        System.out.println("getObjectByKey");
        String p_key = "";
        cDocument instance = new cDocument();
        cObject expResult = null;
        cObject result = instance.getObjectByKey(p_key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

}