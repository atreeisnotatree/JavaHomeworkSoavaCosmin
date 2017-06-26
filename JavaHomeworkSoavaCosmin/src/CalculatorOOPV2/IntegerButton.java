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
public class IntegerButton {
    String s;

    
    public IntegerButton(String i){
        s = i;
    }
    
    public int returnInteger(){
        int integer;
        integer = Integer.parseInt(s);
        return integer;
    }
}
