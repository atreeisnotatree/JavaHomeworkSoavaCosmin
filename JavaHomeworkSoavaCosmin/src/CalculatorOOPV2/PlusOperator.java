/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CalculatorOOPV2;

/**
 *
 * @author atreeisnotatree
 */
public class PlusOperator implements OperatorsInterface{
    //define fields
    public int firstOperand;
    public int secondOperand;
    public String operatorChoice;
    public int result;
    
    public PlusOperator(int firstNumber,String operator,int secondNumber){
        firstOperand = firstNumber;
        secondOperand = secondNumber;
        operatorChoice = operator;
    }
    //method to calculate result   
    @Override
    public int compute(){
        result = firstOperand + secondOperand;
        return result;           
        }
    
}
