/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eliminateanonymousclasses;

/** *

* @author gheorgheaurelpacurar

*/
public class HelloWorldAnonymousClasses {

// Inner interface HelloWorld 
    interface HelloWorld {

        public void greet();

        public void greetSomeone(String someone); 
    }

// Method sayHello prints 
    public void sayHello() {

// Local class EnglishGreetings implemented in the method sayHello() 
    class EnglishGreeting implements HelloWorld {

        String name = "world"; @Override
        public void greet() {

            greetSomeone("world"); }

        @Override
        public void greetSomeone(String someone) {

        name = someone;

        System.out.println("Hello " + name); }

} 
    // end of EnglishGreeting local class
    // create an EnglishGreeting object/instance
    HelloWorld englishGreeting = new EnglishGreeting();
    // create an FrenchGreeting object
    HelloWorld frenchGreeting = new FrenchGreeting();
    //create a SpanoshGreeting object
    HelloWorld spanishGreeting= new SpanishGreeting();

    englishGreeting.greet();
    frenchGreeting.greetSomeone("Fred");
    spanishGreeting.greet();

}
    // main method
    public static void main(String... args) {

        HelloWorldAnonymousClasses myApp = new HelloWorldAnonymousClasses();

    myApp.sayHello(); }

}

