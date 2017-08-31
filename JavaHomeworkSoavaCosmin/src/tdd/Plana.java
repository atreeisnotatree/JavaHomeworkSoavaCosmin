/*
 * 
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class Plana extends FiguraGeometrica implements Definibila{
    
    private String definitie;

    public Plana() {
        definitie = super.getDefinition() + "plana ";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
}
