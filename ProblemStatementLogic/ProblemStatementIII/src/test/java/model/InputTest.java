/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import com.model.Input;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Created by joschinc on 1/4/17.
 */
public class InputTest {
    
    @BeforeClass
    public static void setUpClass() {
        instance = new Input("123");
    }

    /**
     * Test of getPermute method, of class Input.
     */
    @Test
    public void testGetPermute() {
        System.out.println("getPermute");
        Object expResult = "123";
        Object result = instance.getWord();
        assertEquals(expResult, result);

    }
    private static Input instance;
    
}
