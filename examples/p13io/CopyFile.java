package p13io;

import java.io.*;

public class CopyFile {

    public static void main(String[] args) {
        File source = new File(args[0]);
        File destination = new File(args[1]);
        try {
            copy(source, destination);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void copy(File source, File destination) throws IOException {
        try (InputStream in = new FileInputStream(source);
             OutputStream out = new FileOutputStream(destination)) {
            int data;
            while ((data = in.read()) != -1) {
                out.write(data);
            }
        }
    }
}
