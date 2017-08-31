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
public class PatratTest {
    
    public PatratTest() {
    }

    /**
     * Test of getDefinition method, of class Patrat.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        Patrat instance = new Patrat();
        String expResult = "Figura geometrica plana ,patrulaterul cu toate unghiurile drepte, laturile paralele 2 cate 2 si cu toate laturile egale.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
