package p10encapsulation;

public class Book {

    private int stockId;
    private static int nextStockId = 1000;
    private String name;
    private String author;
    private Genre genre;

    public Book(String name, String author, Genre genre) throws Exception {
        stockId = nextStockId;
        nextStockId++;
        setName(name);
        setAuthor(author);
        setGenre(genre);
    }

    public int getStockId() {
        return stockId;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public Genre getGenre() {
        return genre;
    }

    public static int getNextStockId() {
        return nextStockId;
    }

    public void setName(String name) throws Exception {
        if (!name.isEmpty()) {
            this.name = name;
        } else {
            throw new Exception("Book name must nor be empty");
        }
    }

    public void setAuthor(String author) throws Exception {
        if (!author.isEmpty()) {
            this.author = author;
        } else {
            throw new Exception("Author's name must not be empty");
        }

    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void display() {
        System.out.println("Id: " + stockId + " Title: " + name + " by " + author + " genre: " + genre);
    }
}
