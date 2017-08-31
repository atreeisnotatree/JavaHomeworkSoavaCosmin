/*
 * Line definition
 */
package tdd;

/**
 *
 * @author atreeisnotatree
 */
public class SegmentDeDreapta extends Plana{
    
    private String definitie;

    public SegmentDeDreapta() {
        definitie = super.getDefinition() + "determinata de 2 puncte numite capetele segmentului.";
    }
    
    @Override
    public String getDefinition(){
        return definitie;
    }
    
}
