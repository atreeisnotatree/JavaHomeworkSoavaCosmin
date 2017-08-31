/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminateanonymousclasses;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author atreeisnotatree
 */
public class FrenchGreetingTest {
    
    public FrenchGreetingTest() {
    }

    /**
     * Test of greet method, of class FrenchGreeting.
     */
    @Test
    public void testGreet() {
        System.out.println("greet");
        FrenchGreeting instance = new FrenchGreeting();
        instance.greet();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of greetSomeone method, of class FrenchGreeting.
     */
    @Test
    public void testGreetSomeone() {
        System.out.println("greetSomeone");
        String someone = "";
        FrenchGreeting instance = new FrenchGreeting();
        instance.greetSomeone(someone);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
