/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author fabia
 */
public class MainTest {
    
    public MainTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class Main.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Main.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isParent method, of class Main.
     */
    @Test
    public void testIsParent() {
        System.out.println("isParent");
        Person parent = null;
        Person child = null;
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.isParent(parent, child);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isFemale method, of class Main.
     */
    @Test
    public void testIsFemale() {
        System.out.println("isFemale");
        Person person = null;
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.isFemale(person);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isGrandparent method, of class Main.
     */
    @Test
    public void testIsGrandparent() {
        System.out.println("isGrandparent");
        Person grandparent = null;
        Person grandchild = null;
        Main instance = new Main();
        boolean expResult = false;
        boolean result = instance.isGrandparent(grandparent, grandchild);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGrandparents method, of class Main.
     */
    @Test
    public void testGetAllGrandparents() {
        System.out.println("getAllGrandparents");
        Person grandchild = null;
        Main instance = new Main();
        List<Person> expResult = null;
        List<Person> result = instance.getAllGrandparents(grandchild);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGrandchildren method, of class Main.
     */
    @Test
    public void testGetAllGrandchildren() {
        System.out.println("getAllGrandchildren");
        Person grandparent = null;
        Main instance = new Main();
        List<Person> expResult = null;
        List<Person> result = instance.getAllGrandchildren(grandparent);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllSiblings method, of class Main.
     */
    @Test
    public void testGetAllSiblings() {
        System.out.println("getAllSiblings");
        Person root = null;
        Main instance = new Main();
        Map<Person, List<Person>> expResult = null;
        Map<Person, List<Person>> result = instance.getAllSiblings(root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAllGrandmas method, of class Main.
     */
    @Test
    public void testGetAllGrandmas() {
        System.out.println("getAllGrandmas");
        Person root = null;
        Main instance = new Main();
        List<Person> expResult = null;
        List<Person> result = instance.getAllGrandmas(root);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
