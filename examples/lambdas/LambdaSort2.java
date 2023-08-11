package lambdas;


import java.util.Arrays;
import java.util.List;

public class LambdaSort2 {

    public static void main(String[] args) {

        String[] testStrings = {"Yada", "Whatever", "Blabber"};

        System.out.println("Sorted in alphabetical order");
        Arrays.sort(testStrings);
        for (String s : testStrings) {
            System.out.println(s);
        }

        System.out.println("Sorted in length order");
        Arrays.sort(testStrings, (s1, s2) ->  s1.length() - s2.length());
        List<String> sorted = Arrays.asList(testStrings);
        sorted.forEach(s -> System.out.println(s));
    }
}
