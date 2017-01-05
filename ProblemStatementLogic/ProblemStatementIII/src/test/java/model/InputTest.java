/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;

import com.model.Input;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Personal
 */
public class InputTest {
    
    public InputTest() {
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
     * Test of getPermute method, of class Input.
     */
    @Test
    public void testGetPermute() {
        System.out.println("getPermute");
        Input instance = new Input();
        String cat = "cat";
        instance.setPermute(cat);
        Object expResult = "cat";
        Object result = instance.getPermute();
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    


    /**
     * Test of setPermute method, of class Input.
     */
    @Test
    public void testSetPermute() {
        System.out.println("setPermute");
        String dog ="dog";
        Object permute = dog;
        Input instance = new Input();
        instance.setPermute(permute);

    }


    /**
     * Test of toString method, of class Input.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Input instance = new Input();
        String cat = "cat";
        instance.setPermute(cat);
        String expResult = "Input{barter=cat}";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }
    
}
