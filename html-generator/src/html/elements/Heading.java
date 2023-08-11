package html.elements;

public class Heading extends HTMLElement {

    private int level;

    public Heading(int level, String content) {
        super(content);
        this.level = level;
    }

    public Heading(int level, String content, String style ) {
        super(content, style);
        this.level = level;
    }

    @Override
    public String toString() {
        return String.format("<h%s style=\"%s\">%s</h%s>", level, style, content, level);
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

}
