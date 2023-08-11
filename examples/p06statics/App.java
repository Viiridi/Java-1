package p06statics;

import static java.lang.Math.*;

public class App {

    public static void main(String[] args) {

        System.out.println(sqrt(16.0));
        System.out.println(PI);
        sayHello();

        Book b1 = new Book("The Rediscovery of Man", "Cordwainer Smith", Genre.FICTION);
        Book b2 = new Book("It", "Stephen King", Genre.FICTION);
        Book b3 = new Book("Dark Dance", "Tanith Lee", Genre.FICTION);
        Book b4 = new Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE);

        b1.display();
        b2.display();
        b3.display();
        b4.display();
        System.out.println(Book.getNextStockId());

        if (b4.genre == Genre.SCIENCE) {
            System.out.println("It's a science book");
        }

    }

    static void sayHello() {
        System.out.println("Hello");
    }
}
