package p13io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class IoApp {

    public static void main(String[] args) {
        //write to a file
        try {
            Files.writeString(Path.of("file1.txt"), "\nHello from a file\n");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        //read from a file
        try {
            String fileContents = Files.readString(Path.of("file1.txt"));
            System.out.println(fileContents);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // multiple lines
        String[] lines = {"Line 1", "Line 2", "Line 3", "Can we have ", "a more exciting message?"};
        try (BufferedWriter writer = Files.newBufferedWriter(Path.of("lines.txt"))) {
            for (String line : lines) {
                writer.write(line.concat("\n"));
            }
            // not really necessary when using try-with-resources
            writer.flush();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        // buffered reader
        try (BufferedReader reader = Files.newBufferedReader(Path.of("lines.txt"))) {
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
