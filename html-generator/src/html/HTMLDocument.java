package html;

import html.elements.HTMLElement;

import java.util.ArrayList;
import java.util.List;

public class HTMLDocument {

    private String title;
    private List<HTMLElement> elements;

    public HTMLDocument(String title) {
        this.title = title;
        this.elements = new ArrayList<>();
    }

    public String toString() {
        StringBuilder htmlDoc = new StringBuilder();
        htmlDoc.append("<!DOCTYPE html>");
        htmlDoc.append("<html>\n");
        htmlDoc.append("<head>\n");
        htmlDoc.append(String.format("<title>%s</title>\n", title));;
        htmlDoc.append("</head>\n");
        htmlDoc.append("<body>\n");
        for (HTMLElement element : elements) {
            htmlDoc.append(String.format("%s\n", element));
        }
        htmlDoc.append("</body>\n");
        htmlDoc.append("</html>\n");
        return htmlDoc.toString();
    }

    public void addElement(HTMLElement element) {
        elements.add(element);
    }

    public List<HTMLElement> getElements() {
        return elements;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
