package CalculatorOOPV2;
//import CalculatorOOP.*;
import java.util.Scanner;//import Scanner class to read user inpput from keyboard
/**
 *
 * @author Cosmin Soava
 */
public class CalculatorOOP {

    /**
     * An application that handles computation like a pocket calculator.
     * 
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        //define local variables
        String requestNumber = "Please insert a number";
        String operatorRequest = "Please introduce operator(+/-/*//)";
        String integerError = "Sorry, you introduced wrong data type(integer). I quit :)";
        String operatorError = "Sorry, you introduced wrong data(arithmetic operator). I quit :)";
        String resultMessage = "Result is ";
        String operator = null; 
        String secondOperator;
        int result = 0;
        boolean finalOperation = false;
        int intermediaryResult = 0;
        int firstInteger = 0;
        int  secondInteger = 0;
        int  thirdInteger = 0;
        String firstInput; 
        String secondInput;
        
        //create Integer buttons
        IntegerButton zeroInteger = new IntegerButton("0");
        IntegerButton oneInteger = new IntegerButton("1");
        IntegerButton twoInteger = new IntegerButton("2");
        IntegerButton threeInteger = new IntegerButton("3");
        IntegerButton fourInteger = new IntegerButton("4");
        IntegerButton fiveInteger = new IntegerButton("5");
        IntegerButton sixInteger = new IntegerButton("6");
        IntegerButton sevenInteger = new IntegerButton("7");
        IntegerButton eightInteger = new IntegerButton("8");
        IntegerButton nineInteger = new IntegerButton("9");
        
        //create Screen object
        Screen CalculatorScreen = new Screen();  
        
        //initialize Screen at 0 exactly like a real calculator
        CalculatorScreen.clear();
        
        //request a number input from user 
        CalculatorScreen.displayString(requestNumber);
        
        Scanner firstNumberScanner = new Scanner(System.in);
        firstInput = firstNumberScanner.nextLine();
        
        //verify user input is an integer
        try{
            int i = Integer.parseInt(firstInput);
        }catch(NumberFormatException e){
            CalculatorScreen.displayString(integerError);
            System.exit(1);   
        }
        
        //choose IntegerButton
        switch (firstInput) {
            case "0": 
                firstInteger = zeroInteger.returnInteger();  
                break;
            case "1": 
                firstInteger = oneInteger.returnInteger();
                break;
            case "2": 
                firstInteger = twoInteger.returnInteger();
                break;
            case "3": 
                firstInteger = threeInteger.returnInteger();
                break;
            case "4": 
                firstInteger = fourInteger.returnInteger();
                break;
            case "5": 
                firstInteger = fiveInteger.returnInteger();
                break;
            case "6": 
                firstInteger = sixInteger.returnInteger();
                break;
            case "7": 
                firstInteger = sevenInteger.returnInteger();
                break;
            case "8": 
                firstInteger = eightInteger.returnInteger();
                break;
            case "9": 
                firstInteger = nineInteger.returnInteger();
                break;    
            default:
                CalculatorScreen.displayString(integerError);
                System.exit(1);
            }
    
        //chosing arithmetic operation to be done
        CalculatorScreen.displayString(operatorRequest);
        operator = new Scanner(System.in).nextLine();
        
        
        
        //request a number input from user 
        CalculatorScreen.displayString(requestNumber);
        
        Scanner secondNumberScanner = new Scanner(System.in);
        secondInput = secondNumberScanner.nextLine();
        
        //choose IntegerButton
        switch (secondInput) {
            case "0": 
                secondInteger = zeroInteger.returnInteger();  
                break;
            case "1": 
                secondInteger = oneInteger.returnInteger();
                break;
            case "2": 
                secondInteger = twoInteger.returnInteger();
                break;
            case "3": 
                secondInteger = threeInteger.returnInteger();
                break;
            case "4": 
                secondInteger = fourInteger.returnInteger();
                break;
            case "5": 
                secondInteger = fiveInteger.returnInteger();
                break;
            case "6": 
                secondInteger = sixInteger.returnInteger();
                break;
            case "7": 
                secondInteger = sevenInteger.returnInteger();
                break;
            case "8": 
                secondInteger = eightInteger.returnInteger();
                break;
            case "9": 
                secondInteger = nineInteger.returnInteger();
                break;    
            default:
                CalculatorScreen.displayString(integerError);
                System.exit(1);
            }
        
        
        //make computation
        switch (operator) {
            case "+": 
                //create operator Buttons
                PlusOperator CalculatorPlusOperator = new PlusOperator(firstInteger, operator, secondInteger);
                result = CalculatorPlusOperator.compute();
                break;          
            case "-":  
                MinusOperator CalculatorMinusOperator = new MinusOperator(firstInteger, operator, secondInteger);
                result = CalculatorMinusOperator.compute();
                break; 
            case "*": 
                MultiplyOperator CalculatorMultiplyOperator = new MultiplyOperator(firstInteger, operator, secondInteger);
                result = CalculatorMultiplyOperator.compute();
                break;     
            case "/": 
                DivideOperator CalculatorDivideOperator = new DivideOperator(firstInteger, operator, secondInteger);
                result = CalculatorDivideOperator.compute();
                break; 
            default:
                CalculatorScreen.displayString(operatorError);
                System.exit(1);
            }
        
        //send result to display
        CalculatorScreen.displayString(resultMessage + result);
    }
    
}

