package p09exceptions;

public class Book {

    private int stockId;
    private static int nextStockId = 1000;
    public String name;
    public String author;
    public Genre genre;

    public Book(String name, String author, Genre genre) throws Exception {
        stockId = nextStockId;
        nextStockId++;
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception();
        }
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
