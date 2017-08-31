/*
 *class FiguraGeometrica implements the root of hierarchy
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class FiguraGeometrica implements Definibila{
    private String definitie;
    
    

    public FiguraGeometrica() {
        definitie = "Figura geometrica ";
    }

    @Override
    public String getDefinition() {
        return definitie;
        
    }
    
}
