package CalculatorOOP;

import java.util.Scanner;

/**
 *
 * @author Cosmin Soava
 */
public class IntegerButton {
    /**
     *  class IntegerButton checks if user inputs an integer value and handles wrong input with error message
     */
    int integerOutput = 0;

    public IntegerButton(){
    
    } 
    
    public int requestInteger() {
        
    Scanner firstNumberScanner = new Scanner(System.in);
    String firstNumber = firstNumberScanner.nextLine();
        
    //error message displayed and terminating program in case of wrong 
    // user input
    try{
        int i = Integer.parseInt(firstNumber);
    }catch(NumberFormatException e){
        System.out.println("Sorry, you introduced wrong data type(integer). I quit :)");
        System.exit(1);   
    }
    
    integerOutput = Integer.parseInt(firstNumber);
    return integerOutput;
                
    }
   
}
