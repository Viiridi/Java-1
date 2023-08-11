package p12inheritance;

public class Playlist {

    private Playable[] tracks;
    private int numTracks;
    private final int MAX_TRACKS = 10;

    public Playlist() {
        tracks = new Playable[MAX_TRACKS];
    }

    public void addTrack(Playable track) {
        if (numTracks < MAX_TRACKS) {
            tracks[numTracks++] = track;
        } else {
            System.out.println("Playlist is full");
        }
    }

    public void playAll() {
        for (int i = 0; i < numTracks; i++) {
            tracks[i].play();
            if (tracks[i] instanceof File file) {
                file.findInDirectory();
            }
        }
    }

    public void printAll() {
        for (int i = 0; i < numTracks; i++) {
            System.out.println(tracks[i]);
        }
    }
}
