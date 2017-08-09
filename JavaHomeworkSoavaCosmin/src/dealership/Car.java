/*
 *a class for making cars
 */
package dealership;

/**
 *
 * @author Cosmin Soava
 */
public class Car  implements Saleable, Rentable{

    /** 
    @enum enumeration of accepted car colors
    */
    public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
    /**
    Internal hidden fields / attributes
    */
    private Color color;
    private String name;
    private int speed;
    public enum Purpose {RENTABLE,SALEABLE};
 
    /**
    Constructors
    */
    public Car(){
    name = "Default car name";
    speed = 90;
    }
    public Car(String carName, int carSpeed, Color carColor){
    name = carName;
    speed = carSpeed;
    color = carColor;

    }
    /*get-ers and set-ers*/
    public String getName(){
    return(name);
    }
    public Color getColor(){
    return(color);
    }
    public int getSpeed(){
    return(speed);
    }
    public void setName(String newName){
    name = newName;
    }
    public void setColor(Color newColor){
    color = newColor;
    }
    public void setSpeed(short newSpeed){
    speed = newSpeed;
    }
    /**
    The method increase actual speed of Car until final speed specified.
    * @param newSpeed is new speed
    */
    public void increaseSpeed(short newSpeed){
    if(newSpeed > speed){
    speed = newSpeed;
    }
    else if (newSpeed < speed){
    decreaseSpeed(newSpeed);
    }
    }
    /**
    The method decrease actual speed of Car until final speed specified.
    * @param newSpeed is new speed
    */
    public void decreaseSpeed(short newSpeed){
    if(newSpeed < speed){
    speed = newSpeed;
    }
    else if (newSpeed < speed){
    increaseSpeed(newSpeed);
    }
    }
    /**
    Abstract method defined in Saleable interface implemented by class car
    * is implemented here.
    * @override Saleable.getSalePrice() method
    */
    @Override
    public int getSalePrice(Label x){
        return   x.getSalePrice() ;
    }
    /**
    Abstract method defined in Rentable interface implemented by class car
    * is implemented here.
     * @return 
    * @override Rentable.getDailyRentPrice() method
    */
    @Override
    public int getDailyRentPrice(Label y){
        return y.getRentPrice();
    }
   }
