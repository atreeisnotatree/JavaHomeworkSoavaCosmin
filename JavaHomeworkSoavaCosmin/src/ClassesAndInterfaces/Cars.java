/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClassesAndInterfaces;

/**
 *
 * @author atreeisnotatree
 */
public class Cars {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        short mercedesSpeed = 230;
        Car mercedes = new Car("Mercedes", mercedesSpeed, Car.Color.YELLOW, 20000);
        
        short renaultSpeed = 230;
        Car renault = new Car("Renault", renaultSpeed, Car.Color.GREEN, 15000);
        
        short loganSpeed = 230;
        Car logan = new Car("Logan", loganSpeed, Car.Color.GRAY, 10000);
        
        int mercedesPrice = mercedes.getSalePrice();
        int renaultPrice = renault.getSalePrice();
        int loganPrice = logan.getSalePrice();
        
        System.out.println(mercedesPrice);
        System.out.println(renaultPrice);
        System.out.println(loganPrice);
    }
    
}
