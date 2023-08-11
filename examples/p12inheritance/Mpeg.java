package p12inheritance;

public class Mpeg extends Media {

    public Mpeg(String title, double length) {
        super(title, length);
    }

    public void play() {
        System.out.println("Playing mpeg " + title);
    }

    public void pause() {
        System.out.println("Pausing mpeg " + title);
    }
}
