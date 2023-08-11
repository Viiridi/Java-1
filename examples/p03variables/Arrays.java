package p03variables;

import p02classesobjects.Book;

public class Arrays {

    public static void main(String[] args) {
/*
        String[] names = new String[3];
        names[0] = "Fred";
        names[1] = "Ned";
        names[2] = "Ted";
        names[3] = "Jed";
*/
        String[] names = {"Fred", "Ned", "Ted"};
        System.out.println(names[1]);
        names[2] = "Susan";
        System.out.println(names[2]);

        Book[] books = {new Book(1234),
                        new Book(3456,"My Book","Whoever")};

    }
}
