/*
 * 
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class Patrulater extends Plana{
    
    private String definitie;

    public Patrulater() {
        
        definitie = super.getDefinition() + ",patrulaterul ";
        
       
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
    
}
