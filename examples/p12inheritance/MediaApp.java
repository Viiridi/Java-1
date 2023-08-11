package p12inheritance;

public class MediaApp {

    public static void main(String[] args) {

        Playlist playlist = new Playlist();
        playlist.addTrack(new AudioTrack("Blah blah blah", 5.08, "Xyz"));
        playlist.addTrack(new Video("Oppenheimer", 123.05, "Streaming"));
        playlist.addTrack(new Mpeg("Funny one about a cat", 3.30));
        playlist.addTrack(new PowerPointShow("300 slides to go"));
        playlist.playAll();

        playlist.printAll();

        /*
        Media m1 = new AudioTrack("Yada", 2.00, "X");
        Media m2 = new AudioTrack("Yada", 2.00, "X");
        Media m3 = new AudioTrack("Blah", 2.00, "X");

        System.out.println(m1 == m2);
        System.out.println(m1.equals(m2));
        System.out.println(m1.equals(m3));

        System.out.println(m1.hashCode());
        System.out.println(m2.hashCode());
        System.out.println(m1.toString());
        System.out.println(m2);

         */
    }
}
