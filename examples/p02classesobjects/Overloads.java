package p02classesobjects;

public class Overloads {

    void sayHello() {
        System.out.println("Hello");
    }

    void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + " " + lastName);
    }
}
