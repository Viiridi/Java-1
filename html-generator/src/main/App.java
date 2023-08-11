package main;


import html.HTMLDocument;
import html.elements.Heading;
import html.elements.Image;
import html.elements.Paragraph;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class App {

    public static void main(String[] args) {

        HTMLDocument doc = new HTMLDocument("This is a web page");
        doc.addElement(new Heading(1, "Hello World", "color: blue"));
        doc.addElement(new Paragraph("Pieces of Eight!"));
        doc.addElement(new Image("bird4.gif", "width: 200px"));
        try {
            Files.writeString(Path.of("index.html"), doc.toString());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
