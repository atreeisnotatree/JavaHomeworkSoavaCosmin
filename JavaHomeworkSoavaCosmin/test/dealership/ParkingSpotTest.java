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
public class ParkingSpotTest {
    
    public ParkingSpotTest() {
    }

    /**
     * Test of setParkingStatus method, of class ParkingSpot.
     */
    @Test
    public void testSetParkingStatus() {
        System.out.println("setParkingStatus");
        Label l = new Label();
        l.setLabelStatus(Label.LabelType.FORSALE);
        ParkingSpot instance = new ParkingSpot();
        instance.setParkingStatus(l);
        assertEquals(instance.parkingStatus, "OCCUPIED");
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
