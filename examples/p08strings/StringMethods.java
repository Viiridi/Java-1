package p08strings;

public class StringMethods {

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Hello world";

        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.println("ignoring case? " + s1.equalsIgnoreCase(s2));
        System.out.println(s1.indexOf('o', 6));
        System.out.println(s1.indexOf("World"));
        System.out.println(s1.lastIndexOf('o'));
        System.out.println(s1.length());
        System.out.println(s1.replace(' ', '-'));
        System.out.println(s1.substring(6,9));
        System.out.println(s1.substring(s1.indexOf(' ') + 1));

    }
}
