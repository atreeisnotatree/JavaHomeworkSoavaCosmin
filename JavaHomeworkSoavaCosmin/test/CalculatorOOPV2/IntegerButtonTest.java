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
public class IntegerButtonTest {
    
    public IntegerButtonTest() {
    }

    /**
     * Test of returnInteger method, of class IntegerButton.
     */
    @Test
    public void testReturnInteger() {
        System.out.println("returnInteger");
        IntegerButton instance = new IntegerButton("3");
        int expResult = 3;
        int result = instance.returnInteger();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
