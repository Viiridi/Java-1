package main;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        ArrayList<String> shoppingList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.printf("Add new item (1), remove item (2), print items (3), quit (4): ");
            int option = input.nextInt();
            input.nextLine();

            if (option == 1) {
                System.out.printf("New item: ");
                String item = input.nextLine();
                if (!shoppingList.contains(item)) {
                    shoppingList.add(item);
                }
            } else if (option == 2) {
                System.out.printf("Item to remove: ");
                String item = input.nextLine();
                shoppingList.remove(item);
            } else if (option == 3) {
                for (String listItem : shoppingList) {
                    System.out.println(listItem);
                }
            } else if (option == 4) {
                break;
            } else {
                System.out.println("Invalid option");
            }
        }
    }
}
