
package eliminateanonymousclasses;

import eliminateanonymousclasses.HelloWorldAnonymousClasses.HelloWorld;

/**
 *
 * @author cosminsoava
 */

public class SpanishGreeting implements HelloWorld{
    String name = "mundo";        
    
    @Override
    public void greet() {

        greetSomeone("mundo"); }

    @Override
    public void greetSomeone(String someone) {

        name = someone;

        System.out.println("Hola, " + name); }
}
