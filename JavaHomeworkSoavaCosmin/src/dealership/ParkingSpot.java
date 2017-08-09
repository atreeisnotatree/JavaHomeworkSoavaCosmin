/*
 * A class to create parking spots.
 */
package dealership;

/**
 *
 * @author Cosmin Soava
 */
public class ParkingSpot {
    
    String parkingStatus;
    
    public void setParkingStatus(Label l){
        switch (l.labelStatus){
                case "Car for sale":
                    parkingStatus = "OCCUPIED";
                    break;
                case "Car for renting":
                    parkingStatus = "OCCUPIED";
                    break;
                case "This car has been sold":
                    parkingStatus = "FREE";
                    break;
                case "This car has been rented today":
                    parkingStatus = "FREE";
                    break;
                default:
                    System.out.println("Incorect status");
                    break;
            }
    }
}
