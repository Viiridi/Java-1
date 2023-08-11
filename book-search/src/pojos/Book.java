package pojos;

public class Book {

    public String title;
    public String authors;
    public double averageRating;
    public int numPages;

    public String asTableRow() {
        return String.format("%-50s %-50s %4.2f %4d",
                truncateTo50Chars(title),
                truncateTo50Chars(authors),
                averageRating,
                numPages
        );
    }

    public static String truncateTo50Chars(String s) {
        if (s.length() > 50) {
            return s.substring(0,47) + "...";
        }
        return s;
    }
}
