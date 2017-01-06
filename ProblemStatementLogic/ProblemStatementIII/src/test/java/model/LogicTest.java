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
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by joschinc on 1/4/17.
 */
public class LogicTest {

    @BeforeClass
    public static void setUpClass() {
        instance = new Logic();
    }


    /**
     * Test of permutation method, of class Logic.
     */
    @Test
    public void PermutationTest() {
        System.out.println("permutation");
        String prefix = "";
        String in = "123";
        Input input = new Input(in);
        List<String> expResult = Arrays.asList("123","132","213","231","312","321");
        List<String> result = instance.permutation(prefix, input);
        instance.sort(result);
        assertEquals(expResult, result);
    }

    /**
     * Test of sort method, of class Logic.
     */
    @Test
    public void SortTest() {
        System.out.println("sort");
        List<String> array = Arrays.asList("3", "2", "1");
        List<String> expResult = Arrays.asList("1","2","3");
        instance.sort(array);
        assertEquals(expResult,array);
    }

    /**
     * Test of arraySize method, of class Logic.
     */
    @Test
    public void ArraySizeTest() {
        System.out.println("arraySize");
        String[] string = {"1","2","3"};

        int expResult = 3;
        int result = instance.arraySize(string);
        assertEquals(expResult, result);
    }

    private static Logic instance;
    
}
