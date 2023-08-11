package main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        String fileContents = null;
        while (true) {
            System.out.printf("Input a filename: ");
            String fileName = keyboard.nextLine();
            try {
                fileContents = Files.readString(Path.of(fileName));
                break;
            } catch (NoSuchFileException e) {
                System.out.println(e.getMessage() + " cannot be found");
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        String[] lines  = fileContents.split("\n");
        int numLines = 0;
        while (true) {
            System.out.printf("Number of lines to display? ");
            try {
                numLines = Integer.parseInt(keyboard.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Invalid number");
            }
        }

        for (int i = 0; i < numLines; i++) {
            System.out.println(lines[i]);
        }
    }
}
