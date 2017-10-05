/*
 * class Televizor sends an interrupt to Doamna when the sow is about to start
 */
package multithreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atreeisnotatree
 */
public class Televizor extends Thread{
    
    @Override
    public void run(){
        for(int i = 0; i<3; i++){
             System.out.println("Televizor: Just playing commercialls..");
        }
        
        System.out.println("Televizor: Playing the misses favourite show");
        
        Thread doamna = new Doamna();
        doamna.start();
        doamna.interrupt();
        synchronized(doamna){
        try {
            doamna.wait();
        } catch (InterruptedException ex) {
            Logger.getLogger(Domnul.class.getName()).log(Level.SEVERE, null, ex);
        }
        }
//        a notification is sent to announce the biginning of the TV show
        synchronized(this){
        notify();
        }
//        Thread doamna = new Doamna();
//        doamna.start();
//        synchronized(doamna){
//        try{
//            //
//            doamna.wait();
//        }catch(InterruptedException e){
//            e.printStackTrace();
//        }
//        }
        System.out.println("Televizor: The show is over");
    }
}