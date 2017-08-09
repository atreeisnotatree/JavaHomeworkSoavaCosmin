/*
 * The dealership app where the Manager coordinates all activites.
 */
package dealership;

import dealership.Car.Color;
import dealership.Manager.Brand;

/**
 *
 * @author Cosmin Soava
 */
public class dealerApp {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //acquire 5 cars
        Car firstCar  = Manager.acquire(Brand.LOGAN, Color.BLACK);
        Car secondCar = Manager.acquire(Brand.RENAULT, Color.BLACK);
        Car thirdCar  = Manager.acquire(Brand.LOGAN, Color.GREEN);
        Car fourthCar = Manager.acquire(Brand.MERCEDES, Color.WHITE);
        Car fifthCar  = Manager.acquire(Brand.MERCEDES, Color.YELLOW);
        
        
        //make a label for each car
        Label firstCarLabel  =  Manager.createLabel();
        Label secondCarLabel =  Manager.createLabel();
        Label fifthCarLabel  =  Manager.createLabel();
        Label thirdCarLabel  =  Manager.createLabel();
        Label fourthCarLabel =  Manager.createLabel();
        
        //create a parking spot for each car
        ParkingSpot firstParkingSpot = Manager.createParkingSpot();
        ParkingSpot secondParkingSpot = Manager.createParkingSpot();
        ParkingSpot thirdParkingSpot = Manager.createParkingSpot();
        ParkingSpot fourthParkingSpot = Manager.createParkingSpot();
        ParkingSpot fifthParkingSpot = Manager.createParkingSpot();
        
        //set up 3 cars for selling and 2 for renting
        Manager.setUpCarForSaleOrRent(firstCarLabel, Label.LabelType.FORSALE, firstParkingSpot, firstCar);
        Manager.setUpCarForSaleOrRent(secondCarLabel, Label.LabelType.FORSALE, secondParkingSpot, secondCar);
        Manager.setUpCarForSaleOrRent(thirdCarLabel, Label.LabelType.FORSALE, thirdParkingSpot, thirdCar);
        Manager.setUpCarForSaleOrRent(fourthCarLabel, Label.LabelType.FORRENT, fourthParkingSpot, fourthCar);
        Manager.setUpCarForSaleOrRent(fifthCarLabel, Label.LabelType.FORRENT, fifthParkingSpot, fifthCar);
        
        //sell 2 cars by changing the label and making the parking spot free
        Manager.sellCar(firstCarLabel, firstParkingSpot);
        Manager.sellCar(secondCarLabel, secondParkingSpot);

        //rent 1 car
        Manager.rentCar(thirdCarLabel, thirdParkingSpot);


        //at the end of the week the secretary generates a report
        Manager.demandReport();
    }
    
}
