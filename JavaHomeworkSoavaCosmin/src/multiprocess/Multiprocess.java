/*
 * A class which opens 3 instances of Notepad.exe
 */
package multiprocess;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author atreeisnotatree
 */
public class Multiprocess {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ProcessBuilder pb;
            pb = new ProcessBuilder("C:\\Windows\\notepad.exe","D:\\multiprocess.txt");
            Process p1 = pb.start();
            Process p2 = pb.start();
            Process p3 = pb.start();
            
        }catch (IOException ex) {
            Logger.getLogger(Multiprocess.class.getName()).log(Level.SEVERE, "An IO exception is here!", ex);
        }
        
    }
    
}
