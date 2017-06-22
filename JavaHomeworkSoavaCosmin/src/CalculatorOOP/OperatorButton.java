package CalculatorOOP;

/**
 *
 * @author Cosmin Soava
 */
public class OperatorButton {
    //define fields
    public int firstOperand;
    public int secondOperand;
    public String operatorChoice;
    public int result;
    
    public OperatorButton(int firstNumber,String operator,int secondNumber){
        firstOperand = firstNumber;
        secondOperand = secondNumber;
        operatorChoice = operator;
    }
    //method to calculate result   
    public int compute(){
    
        switch (operatorChoice) {
            case "+": 
                result = firstOperand + secondOperand;
                return result;          
            case "-":  
                result = firstOperand - secondOperand;
                return result; 
            case "*": 
                result = firstOperand * secondOperand;
                return result;     
            case "/": 
                result = firstOperand / secondOperand;
                return result;
            default:
                System.out.println("Sorry, you introduced wrong data(arithmetic opeator). I quit :)");
                System.exit(1);
            }
        return 0;
        
        }
    
}
