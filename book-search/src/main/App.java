package main;

import pojos.Book;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void main(String[] args) throws IOException {

        ArrayList<Book> books = new ArrayList<>();
        String fileContents = Files.readString(Path.of("books.csv"));
        String[] lines = fileContents.split("\n");

        for (String line : lines) {
            String[] cols = line.split(",");
            Book book = new Book();
            book.title = cols[1];
            book.authors = cols[2].replace("-", " and ");
            book.averageRating = Double.parseDouble(cols[3]);
            book.numPages = Integer.parseInt(cols[7]);
            books.add(book);
        }

        Scanner input = new Scanner(System.in);
        System.out.printf("Book title search term: ");
        String searchTerm = input.nextLine();
        System.out.printf("Minimum average rating: ");
        double minAvgRating = input.nextDouble();

        for (Book book : books) {
            if (book.title.contains(searchTerm) && book.averageRating >= minAvgRating) {
                System.out.println(book.asTableRow());
            }
        }
    }
}
