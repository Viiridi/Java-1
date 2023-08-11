package main;

import pojos.Album;
import pojos.Artist;
import pojos.Track;

public class AlbumTest {

    public static void main(String[] args) {

        Artist autechre = new Artist("Autechre", "Electronica", false);
        Album inc = new Album("Incunabula", "Studio", autechre);

        System.out.printf("Album: %s, type: %s, artist: %s, genre %s, active? %s\n",
            inc.getName(), inc.getType(), inc.getArtist().getName(), inc.getArtist().getGenre(), inc.getArtist().isActive()
        );

        inc.addTrack("Bike", 8.00);
        inc.addTrack("444", 8.56);
        inc.addTrack("Bronchus 2", 3.33);
        inc.addTrack("Doctrine", 7.49);
        inc.addTrack("Kalpol Introl", 3.19);
        inc.addTrack("Eggshell", 9.02);
        inc.getTracks().add(new Track("Autriche", 6.56));
        for (Track track : inc.getTracks()) {
            System.out.println(track.getTitle() + " - " + track.getDuration());
        }

    }
}
