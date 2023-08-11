package p06statics;

public class Book {

    private int stockId;
    private static int nextStockId = 1000;
    public String name;
    public String author;
    public Genre genre;

    public Book(String name, String author, Genre genre) {
        stockId = nextStockId;
        nextStockId++;
        this.name = name;
        this.author = author;
        this.genre = genre;
    }

    public static int getNextStockId() {
        return nextStockId;
    }

    public void display() {
        System.out.println("Id: " + stockId + " Title: " + name + " by " + author + " genre: " + genre);
    }
}
