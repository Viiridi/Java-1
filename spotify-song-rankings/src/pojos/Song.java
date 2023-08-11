package pojos;

import java.util.Objects;

public class Song {

    private String name;
    private String artist;
    private String spotifyURL;

    public Song(String name, String artist, String spotifyURL) {
        this.name = name;
        this.artist = artist;
        this.spotifyURL = spotifyURL;
    }

    @Override
    public String toString() {
        return String.format("%s,%s,%s\n", name, artist, spotifyURL);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Song song = (Song) o;
        return Objects.equals(name, song.name) && Objects.equals(artist, song.artist);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, artist);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getSpotifyURL() {
        return spotifyURL;
    }

    public void setSpotifyURL(String spotifyURL) {
        this.spotifyURL = spotifyURL;
    }
}
