/*
 * a class responsible for generating reports
 */
package dealership;
/**
 *
 * @author Cosmin Soava
 */
public class Secretary {
    
    public static void generateReport(){
        System.out.println("   CARS IN DEALERSHIP    ");
        System.out.println(Manager.getNumberofCars() + " cars have been acquired.");
        System.out.println("   LABELS APPLIED    ");
        System.out.println(Manager.getNumerOfLabels() + " labels have been created.");
        System.out.println("   PARKING SPOTS    ");
        System.out.println(Manager.getNumberOfParkingSpots() + " parking spots have been created.");
        System.out.println("   CARS FOR SALE    ");
        System.out.println(Manager.getCarsForSale()+ " cars have been set up for selling.");
        System.out.println("   CARS FOR RENT    ");
        System.out.println(Manager.getCarsForRent()+ " cars have been set up for renting.");
        System.out.println("   CARS SOLD    ");
        System.out.println(Manager.getCarsSold()+ " cars have been sold today.");
        System.out.println("   CARS RENTED    ");
        System.out.println(Manager.getCarsRented()+ " cars have been rented today.");
        
    }
}
