package p12inheritance;

public class Video extends Media {

    private String format;

    public Video(String title, double length, String format) {
        super(title, length);
        setFormat(format);
    }

    @Override
    public void play() {
        System.out.println("Playing video " + title);
    }

    @Override
    public void pause() {
        System.out.println("Pausing video " + title);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
