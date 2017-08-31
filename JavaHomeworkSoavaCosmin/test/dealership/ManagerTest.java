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
public class ManagerTest {
    
    public ManagerTest() {
    }

    /**
     * Test of acquire method, of class Manager.
     */
    @Test
    public void testAcquire() {
        System.out.println("acquire");
        Manager.Brand brand = Manager.Brand.RENAULT;
        Car.Color color = Car.Color.GRAY;
        Car expResult = new Car("RENAULT",180, color);
        Car result = Manager.acquire(brand, color);
        assertEquals(expResult.getColor(), result.getColor());
        assertEquals(expResult.getClass(), result.getClass());
        assertEquals(expResult.getName(), result.getName());
        assertEquals(expResult.getSpeed(), result.getSpeed());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createLabel method, of class Manager.
     */
    @Test
    public void testCreateLabel() {
        System.out.println("createLabel");
        Label expResult = new Label();
        Label result = Manager.createLabel();
        assertEquals(expResult.getClass(), result.getClass());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of createParkingSpot method, of class Manager.
     */
    @Test
    public void testCreateParkingSpot() {
        System.out.println("createParkingSpot");
        ParkingSpot expResult = new ParkingSpot();
        ParkingSpot result = Manager.createParkingSpot();
        assertEquals(expResult.getClass(), result.getClass());
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of setUpCarForSaleOrRent method, of class Manager.
     */
    @Test
    public void testSetUpCarForSaleOrRent() {
        System.out.println("setUpCarForSaleOrRent");
        Label l = new Label();
        Label.LabelType m = Label.LabelType.FORRENT;
        l.setLabelStatus(m);
        ParkingSpot p = new ParkingSpot();
        Car c = new Car("MERCEDES", 200, Car.Color.YELLOW);
        Manager.setUpCarForSaleOrRent(l, m, p, c);
        l.setLabelStatus(m);
        assertEquals(l.labelStatus, "Car for renting");
        assertEquals(l.getCarPrice(), 100);
        assertEquals(p.parkingStatus, "OCCUPIED");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of sellCar method, of class Manager.
     */
    @Test
    public void testSellCar() {
        System.out.println("sellCar");
        Label l = new Label();
        ParkingSpot p = new ParkingSpot();
        Manager.sellCar(l, p);
        assertEquals(l.labelStatus, "This car has been sold");
        assertEquals(p.parkingStatus, "FREE");
        assertEquals(Manager.getCarsSold(), 1);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of rentCar method, of class Manager.
     */
    @Test
    public void testRentCar() {
        System.out.println("rentCar");
        Label l = new Label();
        ParkingSpot p = new ParkingSpot();
        Manager.rentCar(l, p);
        assertEquals(l.labelStatus, "This car has been rented today");
        assertEquals(p.parkingStatus, "FREE");
        assertEquals(Manager.getCarsRented(), 1);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of demandReport method, of class Manager.
     */
    @Test
    public void testDemandReport() {
        System.out.println("demandReport");
        Manager.demandReport();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberofCars method, of class Manager.
     */
    @Test
    public void testGetNumberofCars() {
        System.out.println("getNumberofCars");
        int expResult = 1;
        int result = Manager.getNumberofCars();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsRented method, of class Manager.
     */
    @Test
    public void testGetCarsRented() {
        System.out.println("getCarsRented");
        int expResult = 0;
        int result = Manager.getCarsRented();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumerOfLabels method, of class Manager.
     */
    @Test
    public void testGetNumerOfLabels() {
        System.out.println("getNumerOfLabels");
        int expResult = 1;
        int result = Manager.getNumerOfLabels();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfParkingSpots method, of class Manager.
     */
    @Test
    public void testGetNumberOfParkingSpots() {
        System.out.println("getNumberOfParkingSpots");
        int expResult = 0;
        int result = Manager.getNumberOfParkingSpots();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsForSale method, of class Manager.
     */
    @Test
    public void testGetCarsForSale() {
        System.out.println("getCarsForSale");
        int expResult = 0;
        int result = Manager.getCarsForSale();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsForRent method, of class Manager.
     */
    @Test
    public void testGetCarsForRent() {
        System.out.println("getCarsForRent");
        int expResult = 0;
        int result = Manager.getCarsForRent();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of getCarsSold method, of class Manager.
     */
    @Test
    public void testGetCarsSold() {
        System.out.println("getCarsSold");
        int expResult = 0;
        int result = Manager.getCarsSold();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
