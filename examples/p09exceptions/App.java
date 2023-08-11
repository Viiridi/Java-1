package p09exceptions;

import java.io.IOException;
import java.nio.file.NoSuchFileException;

public class App {

    public static void main(String[] args) {

        Parser parser = new Parser();
        int output;
        try {
            output = parser.parse("input.txt");
            System.out.println("Output is: " + output);
        } catch (NoSuchFileException e) {
            System.out.println("File does not exist " + e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Finished");
        }

    }
}
