/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;
import java.io.IOException; //import IOException class to handle wrong user input
import java.util.Scanner; //import Scanner class to read user inpput from keyboard
/**
 *
 * @author atreeisnotatree
 */
 public class Calculator {

    /**
     * Main method consists of an algorithm that performs arithmetic operations
     * while requesting step by step input from the user. 
     * Note: Algorithm is capable of doing fractional division.
     * 
     * @param args the command line arguments
     * 
     */
    public static void main(String[] args)  {
        //define local variables
        boolean addition = false;
        boolean subtraction = false;
        boolean multiplication = false;
        boolean division = false;
        float  result; 
        
        //requesting first number
        System.out.println("Please introduce your first number");
        Scanner firstNumberScanner = new Scanner(System.in);
        String firstNumber = firstNumberScanner.nextLine();
        
        //error message displayed and terminating program in case of wrong 
        // user input
        try{
            int i = Integer.parseInt(firstNumber);
        }catch(NumberFormatException e){ 
            System.out.println("Sorry, you introduced wrong data. I quit :)" );
            System.exit(1);
        }
        //storing first number as an int
        int firstNumberInteger = Integer.parseInt(firstNumber);
        
        //chosing arithmetic operation to be done
        System.out.println("Please introduce operator(+/-/*//)");
        Scanner operatorScanner = new Scanner(System.in);
        String operator = operatorScanner.nextLine();
        
        //storing information about arithmethic operation chosen in a boolean
        //handling wrong user input with error message and program termintation
        switch (operator) {
            case "+": 
                addition = true;
                break;          
            case "-":  
                subtraction = true;
                break; 
            case "*": 
                multiplication = true;
                break;     
            case "/": 
                division = true;
                break;
            default:
                System.out.println("Sorry, you introduced wrong data. I quit :)");
                System.exit(1);
            }
            
        //requesting second number
        System.out.println("Please introduce second number");
        Scanner secondNumberScanner = new Scanner(System.in);
        String secondNumber = secondNumberScanner.nextLine(); 
        
        // error message displayed and terminating program in case of wrong 
        // user input
        try{
            int i = Integer.parseInt(secondNumber);
        }catch(NumberFormatException e){ 
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(1);
        }
        
        //storing second number as an int
        int secondNumberInteger = Integer.parseInt(secondNumber);
        
        //requests '=' operator and handles bad user input
        System.out.println("Please introduce '='");
        Scanner equalityOperatorScanner = new Scanner(System.in);
        String equalityOperator = equalityOperatorScanner.nextLine();
            
        if (!("=".equals(equalityOperator))) {
            System.out.println("Sorry, you introduced wrong data. I quit :)");
            System.exit(1);
        }
         
        //calculates result
        if (addition == true){
            result = firstNumberInteger + secondNumberInteger;
        }
        else if (subtraction == true){
            result = firstNumberInteger - secondNumberInteger;
        }
        else if (multiplication == true) {
            result = firstNumberInteger * secondNumberInteger;
        }
        else  {
            result = (float)firstNumberInteger / secondNumberInteger;
        }
        
        //display result    
        System.out.println("Result:" + firstNumber + operator + secondNumber + equalityOperator + result );
         }
            
            
    }
    

