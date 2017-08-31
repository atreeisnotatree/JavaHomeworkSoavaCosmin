/*
 * 
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class Romb extends Patrulater{
    private String definitie;

    public Romb() {
        definitie = super.getDefinition() + "cu laturile paralele 2 cate 2.";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
    
}
