/*
 * class Doamna sleeps unless interupted to watch TV
 */
package multithreading;




/**
 *
 * @author atreeisnotatree
 */
public class Doamna extends Thread{
            
    
    @Override
    public synchronized void run(){
        while(true){
//            doamna is sleeping awaiting an interrupt
        try {
            Thread.sleep(999999999);
        } catch (InterruptedException ex) {
            for(int i = 0;i<5;i++){
            System.out.println("Doamna: Watching TV");
            }
            return;
        }
        notify();
        }
        
        }
    }


        
    
    
   
        


