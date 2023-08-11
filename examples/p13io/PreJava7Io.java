package p13io;

import java.io.*;

public class PreJava7Io {

    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
             reader = new BufferedReader(
                    new InputStreamReader(
                            new FileInputStream("lines.txt")
                    )
            );
            String line = reader.readLine();
            while (line != null) {
                System.out.println(line);
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("Cannot find file " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Cannot read file " + e.getMessage());
        } finally {
            try {
                reader.close();
            } catch (IOException e) {
                System.out.println("Contact your administrator");
            }
        }
    }
}
