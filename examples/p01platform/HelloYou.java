package p01platform;

import java.util.Scanner;

// the full name of this class is p01platform.HelloYou
public class HelloYou {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        String name = keyboard.nextLine();
        System.out.println("Hello " + name);
        System.out.printf("Hello %s using a formatted string\n", name);
        keyboard.close();
    }
}
