package p12inheritance;

public class PowerPointShow extends File implements Playable {

    private String showName;

    public PowerPointShow(String showName) {
        this.showName = showName;
    }

    @Override
    public void play() {
        System.out.println("Playing powerpoint show " + showName);
    }

    @Override
    public String toString() {
        return "showName= " + showName;
    }

    public String getShowName() {
        return showName;
    }

    public void setShowName(String showName) {
        this.showName = showName;
    }
}
