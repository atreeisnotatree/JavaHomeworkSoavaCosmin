/*
 * A class that for coordinating all activities in dealership
 */
package dealership;

import dealership.Car.Color;
import dealership.Label.LabelType;

/**
 *
 * @author Cosmin Soava
 */
public class Manager {
    private static int numberOfCars = 0;
    private static int numberOfLabels = 0;
    private static int numberOfParkingSpots = 0;
    //this dealership only sells 3 brands
    public enum Brand {MERCEDES, RENAULT, LOGAN}
    private static int carsForSale = 0;
    private static int carsForRent = 0;
    private static int carsSold = 0;
    private static int carsRented = 0;
    
    //method to return Car objects based on brand. color
    public static Car acquire(Brand brand, Color color){
        numberOfCars++;
        switch(brand){
            case MERCEDES:
                return new Car("MERCEDES",200, color);
            case RENAULT:
                return new Car("RENAULT",180, color);
            case LOGAN:
                return new Car("LOGAN",150, color);
            default:
                return null;
             
        }
    }
   
    public static Label createLabel(){
        numberOfLabels++;
        return new Label();
    }
        
    public static ParkingSpot createParkingSpot(){
            numberOfParkingSpots++;
            return new ParkingSpot();
    }
    
     //setting up a car for sale implies selecting the label and ocupying a parking spot
    public static void setUpCarForSaleOrRent(Label l,LabelType m, ParkingSpot p,Car c){
        switch (m){
            case FORSALE:
                carsForSale++;
                break;
            case FORRENT:
                carsForRent++;
                break;
        }
        //first set the label status
        l.setLabelStatus(m);
        //second set the price 
        l.setCarPrice(m, c);
        //third occupy a parking spot
        p.setParkingStatus(l);
    }

    //a method to sell a car which implies changing the label and freeing up the parking spot
    public static void sellCar(Label l, ParkingSpot p){
        carsSold++;
        l.setLabelStatus(Label.LabelType.SOLD);
        p.setParkingStatus(l);
    }

    //a method to rent a car, simillar to selling
    public static void rentCar(Label l, ParkingSpot p){
        carsRented++;
        l.setLabelStatus(Label.LabelType.RENTED);
        p.setParkingStatus(l);
    }
    
    public static void demandReport(){
        Secretary.generateReport();
    }
     //methods usefull for report generating
    public static int getNumberofCars(){
        return numberOfCars;
    }
    
    public static int getCarsRented(){
        return carsRented;
    }
    
    public static int getNumerOfLabels(){
        return numberOfLabels;
    }
    
    public static int getNumberOfParkingSpots(){
        return numberOfParkingSpots;
    }
    
    public static int getCarsForSale(){
        return carsForSale;
    }

    public static int getCarsForRent(){
        return carsForRent;
    }
        
    public static int getCarsSold(){
        return carsSold;
    }
}
