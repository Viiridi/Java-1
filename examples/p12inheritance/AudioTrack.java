package p12inheritance;

public class AudioTrack extends Media {

    private String artist;

    public AudioTrack(String title, double length, String artist) {
        super(title, length);
        setArtist(artist);
    }

    public void play() {
        System.out.println("Playing audio track " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing audio track " + title);
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String toString() {
        return super.toString() + " artist = " + artist;
    }
}
