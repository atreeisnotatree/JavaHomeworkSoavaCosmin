package CalculatorOOPV2;


/**
 *
 * @author Cosmin Soava
 * 
 *  a class with methods for displaying int or string values and clearing the screen(0)
 */
public class Screen {
  
    public Screen (){
        
    }
    //prints an intger
    public void displayInt(int i){
        //screen = display;
        System.out.println(i);
    }
    //prints a string
    public void displayString(String s){
        System.out.println(s);
    }
    //prints 0 
    public void clear(){
        System.out.println("0");
    }
}
