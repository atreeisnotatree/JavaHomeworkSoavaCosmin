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
public class DivideOperatorTest {
    
    public DivideOperatorTest() {
    }

    /**
     * Test of compute method, of class DivideOperator.
     */
    @Test
    public void testCompute() {
        System.out.println("compute");
        DivideOperator instance = new DivideOperator(4, "operator", 2);
        int expResult = 2;
        int result = instance.compute();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
