package pojos;

import java.util.ArrayList;
import java.util.List;

public class Album {

    private String name;
    private String type;
    private Artist artist;
    private List<Track> tracks;

    public Album(String name, String type, Artist artist) {
        this.name = name;
        this.type = type;
        this.artist = artist;
        this.tracks = new ArrayList<>();
    }

    public boolean isTrackOnTheAlbum(String title) {
        for (Track track : tracks) {
            if (track.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public void addTrack(String title, double duration) {
        if (!isTrackOnTheAlbum(title)) {
            tracks.add(new Track(title, duration));
        }
    }

    public List<Track> getTracks() {
        return new ArrayList<>(tracks);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Artist getArtist() {
        return artist;
    }

    public void setArtist(Artist artist) {
        this.artist = artist;
    }

}
