/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOPV2;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atreeisnotatree
 */
public class MinusOperatorTest {
    
    public MinusOperatorTest() {
    }

    /**
     * Test of compute method, of class MinusOperator.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        MinusOperator instance = new MinusOperator(3, "operator", 1);
        int expResult = 2;
        int result = instance.compute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
