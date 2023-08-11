package p12inheritance;

import java.util.Objects;

public abstract class Media implements Playable {

    protected String title;
    protected double length;

    public Media(String title, double length) {
        setTitle(title);
        setLength(length);
    }

    public abstract void pause() ;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "title='" + title + '\'' +
                ", length=" + length         ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Media media = (Media) o;
        return Double.compare(media.length, length) == 0 && Objects.equals(title, media.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, length);
    }
}
