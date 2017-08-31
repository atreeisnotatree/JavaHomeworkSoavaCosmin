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
public class CarTest {
    
    public CarTest() {
    }

    /**
     * Test of getName method, of class Car.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Car instance = new Car();
        String expResult = "Default car name";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getColor method, of class Car.
     */
    @Test
    public void testGetColor() {
        System.out.println("getColor");
        Car instance = new Car();
        Car.Color expResult = null;
        Car.Color result = instance.getColor();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSpeed method, of class Car.
     */
    @Test
    public void testGetSpeed() {
        System.out.println("getSpeed");
        Car instance = new Car();
        int expResult = 90;
        int result = instance.getSpeed();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Car.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String newName = "My car";
        Car instance = new Car();
        instance.setName(newName);
        assertEquals(instance.getName(), newName);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setColor method, of class Car.
     */
    @Test
    public void testSetColor() {
        System.out.println("setColor");
        Car.Color newColor = Car.Color.BLACK;
        Car instance = new Car();
        instance.setColor(newColor);
        assertEquals(newColor,instance.getColor());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setSpeed method, of class Car.
     */
    @Test
    public void testSetSpeed() {
        System.out.println("setSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.setSpeed(newSpeed);
        assertEquals(0,instance.getSpeed());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of increaseSpeed method, of class Car.
     */
    @Test
    public void testIncreaseSpeed() {
        System.out.println("increaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.increaseSpeed(newSpeed);
        assertEquals(newSpeed, instance.getSpeed());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of decreaseSpeed method, of class Car.
     */
    @Test
    public void testDecreaseSpeed() {
        System.out.println("decreaseSpeed");
        short newSpeed = 0;
        Car instance = new Car();
        instance.decreaseSpeed(newSpeed);
        assertEquals(newSpeed, instance.getSpeed());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getSalePrice method, of class Car.
     */
    @Test
    public void testGetSalePrice() {
        System.out.println("getSalePrice");
        Label x = new Label();
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getSalePrice(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getDailyRentPrice method, of class Car.
     */
    @Test
    public void testGetDailyRentPrice() {
        System.out.println("getDailyRentPrice");
        Label y = new Label();
        Car instance = new Car();
        int expResult = 0;
        int result = instance.getDailyRentPrice(y);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
