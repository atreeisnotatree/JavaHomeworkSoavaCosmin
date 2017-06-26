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
public class Car  implements Saleable, Rentable{

    private int Price;
    /**
    @enum enumeration of accepted car colors
    */
    public enum Color { WHITE, RED, YELLOW, GREEN, GRAY, BLACK };
    /**
    Internal hidden fields / attributes
    */
    private Color color;
    private String name;
    private short speed;
 
 
    /**
    Constructors
    */
    public Car(){
    name = "Default car name";
    speed = 90;
    }
    public Car(String carName, short carSpeed, Color carColor, int salePrice){
    name = carName;
    speed = carSpeed;
    color = carColor;
    Price = salePrice;

    }
    /*get-ers and set-ers*/
    public String getName(){
    return(name);
    }
    public Color getColor(){
    return(color);
    }
    public short getSpeed(){
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
    public int getSalePrice(){
    return Price;
    }
    /**
    Abstract method defined in Rentable interface implemented by class car
    * is implemented here.
    * @override Rentable.getDailyRentPrice() method
    */
    @Override
    public int getDailyRentPrice(){
    return(250);
    }
   }
