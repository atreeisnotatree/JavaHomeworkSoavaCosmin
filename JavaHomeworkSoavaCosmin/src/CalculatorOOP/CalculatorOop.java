package CalculatorOOP;
import java.util.Scanner;//import Scanner class to read user inpput from keyboard
/**
 *
 * @author Cosmin Soava
 */
public class CalculatorOop {

    /**
     * An application that handles computation like a pocket calculator.
     * 
     * @param args the command line arguments
     */
     
    public static void main(String[] args) {
        //define local variables
        String requestNumber = "Please insert a number";
        String firstOperatorRequest = "Please introduce operator(+/-/*//)";
        String secondOperatorRequest = "Please introduce operator(+/-/*//) or '='";
        String firstOperator; 
        String secondOperator;
        int result = 0;
        boolean finalOperation = false;
        int intermediaryResult;
        int firstInteger;
        int  secondInteger;
        int  thirdInteger;
        
        //create new Screen object and
        //initialize Screen at 0 exactly like a real calculator
        new Screen().clear();
        
        //request a number input from user 
        new Screen().displayString(requestNumber);
        
        //store integer output from a IntegerButton object in a local variable
        firstInteger = new IntegerButton().requestInteger();

        //chosing arithmetic operation to be done
        new Screen().displayString(firstOperatorRequest);
        firstOperator = new Scanner(System.in).nextLine();
        
        //request a number input from user 
        new Screen().displayString(requestNumber);
        
        //store integer output from a IntegerButton object in a local variable
        secondInteger = new IntegerButton().requestInteger();
        
        //chosing arithmetic operation to be done
        new Screen().displayString(secondOperatorRequest);
        secondOperator = new Scanner(System.in).nextLine();
        
        //make first computation
        intermediaryResult = new OperatorButton(firstInteger, firstOperator,secondInteger ).compute();
        
        //begin a loop for multiple computations
        while (finalOperation == false){
            if ("=".equals(secondOperator)) {
            result = intermediaryResult;
            finalOperation = true;
        }
            else {
                new Screen().displayString(requestNumber);
                thirdInteger = new IntegerButton().requestInteger();
                intermediaryResult = new OperatorButton(intermediaryResult, secondOperator,thirdInteger ).compute();
                new Screen().displayString(secondOperatorRequest);
                secondOperator = new Scanner(System.in).nextLine();
                    }
    }
 
        //send result to display
        new Screen().displayInt(result);
    }
    
}

