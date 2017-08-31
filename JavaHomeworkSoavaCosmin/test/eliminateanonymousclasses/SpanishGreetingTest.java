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
public class SpanishGreetingTest {
    
    public SpanishGreetingTest() {
    }

    /**
     * Test of greet method, of class SpanishGreeting.
     */
    @Test
    public void testGreet() {
        System.out.println("greet");
        SpanishGreeting instance = new SpanishGreeting();
        instance.greet();
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }

    /**
     * Test of greetSomeone method, of class SpanishGreeting.
     */
    @Test
    public void testGreetSomeone() {
        System.out.println("greetSomeone");
        String someone = "";
        SpanishGreeting instance = new SpanishGreeting();
        instance.greetSomeone(someone);
        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
    }
    
}
