
package eliminateanonymousclasses;

import eliminateanonymousclasses.HelloWorldAnonymousClasses.HelloWorld;

/**
 *
 * @author atreeisnotatree
 */
public class FrenchGreeting implements HelloWorld{
    String name = "tout le monde";
    @Override
    public void greet() {

        greetSomeone("tout le monde"); }

    @Override
    public void greetSomeone(String someone) {

        name = someone;

        System.out.println("Salut " + name); } 
}
