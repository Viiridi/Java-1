package main;

import pojos.Song;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {

    public static void main(String[] args) {

        Set<Song> numberOneSongs = new HashSet<>();
        Path in = Path.of("data.csv");
        Path out = Path.of("number-ones.csv");

        try (BufferedWriter writer = Files.newBufferedWriter(out)) {
            // read the file
            List<String> lines = Files.readAllLines(in);
            lines.remove(0);
            // populate the set
            for (String line : lines) {
                String[] columns = line.split(",");
                if (columns[0].equals("1")) {
                    String name = columns[1];
                    String artist = columns[2];
                    String spotifyUrl = columns[4];
                    numberOneSongs.add(new Song(name, artist, spotifyUrl));
                }
            }
            // read the set
            for (Song song : numberOneSongs) {
                writer.write(song.toString());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
