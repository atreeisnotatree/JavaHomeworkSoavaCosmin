/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atreeisnotatree
 */
public class PlanaTest {
    
    public PlanaTest() {
    }

    /**
     * Test of getDefinition method, of class Plana.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Plana instance = new Plana();
        String expResult = "Figura geometrica plana ";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
