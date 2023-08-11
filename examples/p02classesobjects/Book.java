package p02classesobjects;

public class Book {

    // fields - all methods can see these
    private int isbn;
    String name;
    String author;
    private boolean onLoan;

    public Book(int isbn) {
        setIsbn(isbn);
        // imagine more code here
    }

    public Book(int isbn, String name, String author) {
        this(isbn);
        this.name = name;
        this.author = author;
    }

    public void checkout() {
        onLoan = true;
    }

    public boolean isOnLoan() {
        return onLoan;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public int getIsbn() {
        return isbn;
    }
}
