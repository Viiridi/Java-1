package p02classesobjects;

public class App {

    public static void main(String[] args) {

        Book book1 = new Book(1234);
        Book book2 = new Book(3456, "My Other Book", "Whoever");
        book1.name = "My Book";
        //book1.setIsbn(1234);
        book1.checkout();

        System.out.println(book1.name + " ISBN " + book1.getIsbn() + ", On loan? " + book1.isOnLoan());
        System.out.println(book2.name + " ISBN " + book2.getIsbn() + " by " + book2.author
                + ", On loan? " + book2.isOnLoan());

        /*
        Overloads overloads = new Overloads();
        overloads.sayHello();
        overloads.sayHello("Brian");
        overloads.sayHello("Brian","Short");
         */
        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book1 == book2);
    }
}
