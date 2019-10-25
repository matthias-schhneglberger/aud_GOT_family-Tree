/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package familyTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
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
     * Test of isParent method, of class Main.
     */
    @Test
    public void testIsParent() {
        System.out.println("isParent");
        Person parent = null;
        Person child = new Person(true, parent,null, null);
        List<Person> kind = new ArrayList<>();
        kind.add(child);
        parent = new Person(true, null, null,kind);
        child.setDad(parent);
        Main instance = new Main();
        assertTrue(instance.isParent(parent, child));
    }

    /**
     * Test of isFemale method, of class Main.
     */
    @Test
    public void testIsFemale() {
        System.out.println("isFemale");
        Person person = new Person(false, null,null, null);
        Main instance = new Main();
        assertTrue(instance.isFemale(person));
    }

    /**
     * Test of isGrandparent method, of class Main.
     */
    @Test
    public void testIsGrandparent() {
        System.out.println("isGrandparent");
        Person grandparent = new Person(true, null, null,null);
        Person parent = new Person(true, null, null, null);
        Person child = new Person(true, null,null, null);
        child.setDad(parent);
        parent.setDad(grandparent);
        Main instance = new Main();
        assertTrue(instance.isGrandparent(grandparent, child));
    }

    /**
     * Test of getAllGrandparents method, of class Main.
     */
    @Test
    public void testGetAllGrandparents() {
        System.out.println("getAllGrandparents");
        Person grandparent = new Person(true, null, null,null);
        Person grandparent1 = new Person(false, null, null,null);
        Person grandparent2 = new Person(true, null, null,null);
        Person grandparent3 = new Person(false, null, null,null);
        Person parent = new Person(true, null, null, null);
        Person parent1 = new Person(false, null, null, null);
        Person child = new Person(true, null,null, null);
        child.setDad(parent);
        child.setMom(parent1);
        parent.setDad(grandparent);
        parent.setMom(grandparent1);
        parent1.setDad(grandparent2);
        parent1.setMom(grandparent3);
        
        Main instance = new Main();
        List<Person> expResult = new ArrayList<>();
        expResult.add(grandparent);expResult.add(grandparent1);expResult.add(grandparent2);expResult.add(grandparent3);
        List<Person> result = instance.getAllGrandparents(child);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllGrandchildren method, of class Main.
     */
    @Test
    public void testGetAllGrandchildren() {
        System.out.println("getAllGrandchildren");
        Person grandparent = new Person(true, null, null,null);
        Person parent = new Person(true, null, null, null);
        Person parent1 = new Person(false, null, null, null);
        Person child = new Person(true, null,null, null);
        Person child1 = new Person(false, null,null, null);
        Person child2 = new Person(true, null,null, null);
        Person child3 = new Person(false, null,null, null);
        parent.setDad(grandparent);
        parent1.setDad(grandparent);
        child.setDad(parent);
        child1.setDad(parent);
        child2.setMom(parent1);
        child2.setMom(parent1);
        
        Main instance = new Main();
        List<Person> expResult = new ArrayList<>();
        expResult.add(child);expResult.add(child1);expResult.add(child2);expResult.add(child3);
        List<Person> result = instance.getAllGrandchildren(child);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllSiblings method, of class Main.
     */
    @Test
    public void testGetAllSiblings() {
        System.out.println("getAllSiblings");
        Person grandparentm = new Person(true, null, null,null);
        Person grandparentw = new Person(false, null, null,null);
        Person parentm = new Person(true, null, null, null);
        Person parent1m = new Person(true, null, null, null);
        Person parent1w = new Person(false, null, null, null);
        Person childm1 = new Person(true, null,null, null);
        Person childm2 = new Person(true, null,null, null);
        Person child11 = new Person(false, null,null, null);
        Person child21 = new Person(true, null,null, null);
        Person child31 = new Person(false, null,null, null);
        parentm.setDad(grandparentm);
        parentm.setMom(grandparentw);
        parent1m.setDad(grandparentm);
        parent1m.setMom(grandparentw);
        parent1w.setDad(grandparentm);
        parent1w.setMom(grandparentw);
        childm1.setDad(parentm);
        childm2.setDad(parentm);
        child11.setDad(parent1m);
        child21.setDad(parent1m);
        child31.setMom(parent1w);
        Main instance = new Main();
        Map<Person, List<Person>> expResult = new HashMap<>();
        expResult.put(parent1m, Arrays.asList(parent1w, parentm));
        expResult.put(parent1w, Arrays.asList(parent1m, parentm));
        expResult.put(parentm, Arrays.asList(parent1w, parent1m));
        expResult.put(childm1, Arrays.asList(childm2));
        expResult.put(childm2, Arrays.asList(childm1));
        expResult.put(child11, Arrays.asList(child21));
        expResult.put(child21, Arrays.asList(child11));
        Map<Person, List<Person>> result = instance.getAllSiblings(grandparentm);
        assertEquals(expResult, result);
    }

    /**
     * Test of getAllGrandmas method, of class Main.
     */
    @Test
    public void testGetAllGrandmas() {
        System.out.println("getAllGrandmas");
        Person grandparent = new Person(true, null, null,null);
        Person grandparent1 = new Person(false, null, null,null);
        Person grandparent2 = new Person(true, null, null,null);
        Person grandparent3 = new Person(false, null, null,null);
        Person parent = new Person(true, null, null, null);
        Person parent1 = new Person(false, null, null, null);
        Person child = new Person(true, null,null, null);
        child.setDad(parent);
        child.setMom(parent1);
        parent.setDad(grandparent);
        parent.setMom(grandparent1);
        parent1.setDad(grandparent2);
        parent1.setMom(grandparent3);
        
        Main instance = new Main();
        List<Person> expResult = new ArrayList<>();
        expResult.add(grandparent1);expResult.add(grandparent3);
        List<Person> result = instance.getAllGrandmas(child);
        assertEquals(expResult, result);
    }
    
}
