package p09exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Parser {

    public int parse(String file) throws IOException {

        String fileContents = Files.readString(Path.of(file));
        int result = Integer.parseInt(fileContents);
        return result;
    }
}
