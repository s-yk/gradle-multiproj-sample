/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package proj1;

import proj2.Library;

public class App {
    public String getGreeting() {
        return "Hello world.";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());

        System.out.println(new Library().createMessage());
    }
}
