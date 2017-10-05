/*
 * 
 */
package multithreading;

/**
 *
 * @author atreeisnotatree
 */
public class multifamily {

    /**
     * @param args the command line arguments
     * @throws java.lang.InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {
        Thread doamna = new Doamna();
        Thread domnul = new Domnul();
        Thread aspirator = new Aspirator();
        Thread televizor = new Televizor();
        Thread trabuc = new Trabuc();
        
        aspirator.start();
        trabuc.start();
        
        //domnul starts cleaning but when he notices the wifes favourite show 
        //he waits gratiously for it to end :)
        domnul.start();
        //thread televizor will be created inside the Domnul class and thread
        //Doamna will be created inside the televizor class. This has been so that 
        // the proper monitors can be attained
        

       
        

    }
    
}
