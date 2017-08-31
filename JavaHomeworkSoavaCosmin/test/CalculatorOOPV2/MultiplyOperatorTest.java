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
public class MultiplyOperatorTest {
    
    public MultiplyOperatorTest() {
    }

    /**
     * Test of compute method, of class MultiplyOperator.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        MultiplyOperator instance = new MultiplyOperator(3, "operator", 5);
        int expResult = 15;
        int result = instance.compute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
