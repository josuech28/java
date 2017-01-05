/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Arrays;
import java.util.List;

import com.model.Input;
import com.model.Logic;
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
public class LogicTest {
    
    public LogicTest() {
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
     * Test of permutation method, of class Logic.
     */
    @Test
    public void testPermutation() {
        System.out.println("permutation");
        String prefix = "";
        String in = "cat";
        Input input = new Input();
        input.setPermute(in);
        Logic instance = new Logic();
        List<String> expResult = Arrays.asList("cat","cta","atc","act","tca","tac");
        List<String> result = instance.permutation(prefix, input);
        assertEquals(expResult, result);
        if (!result.equals(expResult)) {
            fail("The test case is a prototype.");
        }
    }

    /**
     * Test of sort method, of class Logic.
     */
    @Test
    public void testSort() {
        System.out.println("sort");
        List<String> array = Arrays.asList("c", "a", "t");
        Logic instance = new Logic();
        instance.sort(array);
    }

    /**
     * Test of assignArray method, of class Logic.
     */
    @Test
    public void testAssignArray() {
        System.out.println("assignArray");
        String[] list_permutation = {"c","a","t"};
        List<String> permutation = Arrays.asList("c", "a", "t");;
        Logic instance = new Logic();
        instance.assignArray(list_permutation, permutation);

    }

    /**
     * Test of printArray method, of class Logic.
     */
    @Test
    public void testPrintArray() {
        System.out.println("printArray");
        String[] list_permutation = {"c","a","t"};
        Logic instance = new Logic();
        instance.printArray(list_permutation);

    }

    /**
     * Test of arraySize method, of class Logic.
     */
    @Test
    public void testArraySize() {
        System.out.println("arraySize");
        String[] string = {"c","a","t"};
        Logic instance = new Logic();
        int expResult = 3;
        int result = instance.arraySize(string);
        assertEquals(expResult, result);
        if (result !=expResult ) {
            fail("The test case is a prototype.");
        }
    }
    
}
