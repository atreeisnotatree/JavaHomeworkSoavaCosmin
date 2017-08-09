/*
 * 
 */
package dealership;


/**
 *
 * @author Cosmin Soava
 */
public interface Saleable {
         /**
 @const REC_SALE_PRICE is recommended price to sell
 */
 public static final boolean SALEABLE = true;

 /**
 * Method returns the value of item that implements the saleable
interface.
 * Class that implements the interface should implement this method.
     * @param x
 @return method returns price for sale
 */
 public int getSalePrice(Label x); 
}
