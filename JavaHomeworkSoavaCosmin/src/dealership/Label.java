/*
 * A class for making labels.
 */
package dealership;

/**
 *
 * @author atreeisnotatree
 */
public class Label {
    
    private final int MERCEDESPRICE = 10000;
    private final int RENAULTPRICE= 20000;
    private final int LOGANPRICE= 30000;
    private final int MERCEDESRENT = 100;
    private final int RENAULTRENT= 200;
    private final int LOGANRENT= 300;
    String labelType;
    public enum LabelType {FORSALE, FORRENT, SOLD, RENTED};
    private int carPrice;
    String labelStatus;
   

    
    public int getSalePrice(){
        return carPrice;
    }
    
    public int getRentPrice(){
        return carPrice;
    }
    
    //a method to set the Car price depeding if the car is for rent or for sale and on the car type 
    public void setCarPrice(LabelType x, Car y){
           switch(x){
            case FORSALE:
                switch (y.getName()){
                    case "MERCEDES":
                        carPrice =  MERCEDESPRICE;
                        break;
                    case "RENAULT":
                        carPrice =  RENAULTPRICE;
                        break;
                    case "LOGAN":
                        carPrice =  LOGANPRICE;
                        break;
                    default:
                        System.out.println("we do not sell this type of car");
                }
               
            case FORRENT:
                switch (y.getName()){
                    case "MERCEDES":
                        carPrice =  MERCEDESRENT;
                        break;
                    case "RENAULT":
                        carPrice =  RENAULTRENT;
                        break;
                    case "LOGAN":
                        carPrice =  LOGANRENT;
                        break;
                    default:
                        System.out.println("we do not rent this type of car");    
                }
            
        }
    }
    
    //a method to set the label status
    public void setLabelStatus(LabelType l){
        switch(l){
            case FORSALE:
                labelStatus = "Car for sale";
            case FORRENT:
                labelStatus = "Car for renting";
            case SOLD:
                labelStatus = "This car has been sold";
                break;
            case RENTED:
                labelStatus = "This car has been rented today";
                break;    
        }
    }
}

