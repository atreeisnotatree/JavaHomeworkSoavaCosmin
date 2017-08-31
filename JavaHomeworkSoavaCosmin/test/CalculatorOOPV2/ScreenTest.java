/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOPV2;

import org.junit.Test;

/**
 *
 * @author atreeisnotatree
 */
public class ScreenTest {
    
    public ScreenTest() {
    }

    /**
     * Test of displayInt method, of class Screen.
     */
    @Test
    public void testDisplayInt() {
        System.out.println("displayInt");
        int i = 8;
        Screen instance = new Screen();
        instance.displayInt(i);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of displayString method, of class Screen.
     */
    @Test
    public void testDisplayString() {
        System.out.println("displayString");
        String s = "potatos";
        Screen instance = new Screen();
        instance.displayString(s);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class Screen.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        Screen instance = new Screen();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
