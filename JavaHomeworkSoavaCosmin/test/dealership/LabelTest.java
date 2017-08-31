/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dealership;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atreeisnotatree
 */
public class LabelTest {
    
    public LabelTest() {
    }

    /**
     * Test of getSalePrice method, of class Label.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Label instance = new Label();
        int expResult = 0;
        int result = instance.getSalePrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getRentPrice method, of class Label.
     */
    @Test
    public void testGetRentPrice() {
        System.out.println("getRentPrice");
        Label instance = new Label();
        int expResult = 0;
        int result = instance.getRentPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setCarPrice method, of class Label.
     */
    @Test
    public void testSetCarPrice() {
        System.out.println("setCarPrice");
        Label.LabelType x = Label.LabelType.FORRENT;
        Car y = new Car();
        y.setName("MERCEDES");
        Label instance = new Label();
        instance.setCarPrice(x, y);
        assertEquals(instance.getRentPrice(), 100);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setLabelStatus method, of class Label.
     */
    @Test
    public void testSetLabelStatus() {
        System.out.println("setLabelStatus");
        Label.LabelType l = Label.LabelType.FORSALE;
        Label instance = new Label();
        instance.setLabelStatus(l);
        assertEquals(instance.labelStatus, "Car for sale");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
