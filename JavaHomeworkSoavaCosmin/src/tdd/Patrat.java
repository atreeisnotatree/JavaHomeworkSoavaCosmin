/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class Patrat extends Dreptunghi{
    private String definitie;

    public Patrat() {
        
        definitie = super.getDefinition() + "si cu toate laturile egale.";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
}
