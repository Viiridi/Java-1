package p08strings;

public class StringEquality {

    public static void main(String[] args) {

        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");

        System.out.println("s1 == s2? " + (s1 == s2));
        System.out.println("s1 == s3? " + (s1 == s3));
        System.out.println("s1.equals(s2)? " + s1.equals(s2));
        System.out.println("s1.equals(s3)? " + s1.equals(s3));
    }
}
