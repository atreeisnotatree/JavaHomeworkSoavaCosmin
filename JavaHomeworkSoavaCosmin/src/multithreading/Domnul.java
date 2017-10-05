/*
 * class Domnul is responsible for cleaning and waiting for the TV show to begin
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author atreeisnotatree
 */
public class Domnul extends Thread{
    
    @Override
    public  void run() {
        for (int i = 0; i<5; i++){
            System.out.println("Domnul: I'm cleaning.");
        }
        Thread televizor = new Televizor();
        //Domnul porneste televizorul si va astepta inceperea emisiunii
        televizor.start();
       synchronized(televizor){
        try {
            televizor.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Domnul.class.getName()).log(Level.SEVERE, null, ex);
        }
       }
        
        

        //acum pooate termina curatenia
        for (int i = 0; i<5; i++){
            System.out.println("Domnul: Finishing cleaning.");
        }
        
    }
}
        
            
        

    

