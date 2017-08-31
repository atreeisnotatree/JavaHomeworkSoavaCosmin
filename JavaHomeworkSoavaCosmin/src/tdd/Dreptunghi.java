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
public class Dreptunghi extends Patrulater {
    
    private String definitie;

    public Dreptunghi() {
        
        definitie = super.getDefinition() + "cu toate unghiurile drepte, laturile paralele 2 cate 2 ";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
        
    }
    
}
