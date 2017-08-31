/*
 * 
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class Triunghi extends Plana {
    private String definitie;

    public Triunghi() {
        
        definitie = super.getDefinition() + "formata din 3 laturi.";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
}
