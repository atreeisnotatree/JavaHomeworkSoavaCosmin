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
public class SegmentDeDreaptaTest {
    
    public SegmentDeDreaptaTest() {
    }

    /**
     * Test of getDefinition method, of class SegmentDeDreapta.
     */
    @Test
    public void testGetDefinition() {
        System.out.println("getDefinition");
        SegmentDeDreapta instance = new SegmentDeDreapta();
        String expResult = "Figura geometrica plana determinata de 2 puncte numite capetele segmentului.";
        String result = instance.getDefinition();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
