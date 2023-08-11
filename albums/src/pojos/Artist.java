package pojos;

public class Artist {

    private String name;
    private String genre;
    private boolean active;

    public Artist(String name, String genre, boolean active) {
        this.name = name;
        this.genre = genre;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
