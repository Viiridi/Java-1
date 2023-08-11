package p10encapsulation;

public class BookApp {

    public static void main(String[] args) {

        try {
            Book b1 = new Book("The Rediscovery of Man", "Cordwainer Smith", Genre.FICTION);
            Book b2 = new Book("It", "Stephen King", Genre.FICTION);
            Book b3 = new Book("Dark Dance", "Tanith Lee", Genre.FICTION);
            Book b4 = new Book("A Brief History of Time", "Stephen Hawking", Genre.SCIENCE);
            Book b5 = new Book("Unknown", "Mr. X", Genre.FICTION);
            b5.setGenre(Genre.HISTORY);

            b1.display();
            b2.display();
            b3.display();
            b4.display();
            b5.display();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
