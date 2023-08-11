package p05collections;

import java.util.ArrayList;

public class Lists {

    public static void main(String[] args) {
        // generic type inference - the diamond operator <>, Java 7 onwards
        ArrayList<String> names = new ArrayList<>();
        names.add("David");
        names.add("Sarah");
        names.add("Fiona");
        names.add("Simon");
        names.add("Gerry");

        names.remove("Sarah");
        System.out.println(names.get(1));
        names.set(3, "Barry");
        System.out.println(names.contains("Fred"));

        System.out.println();
        for (String name: names) {
            System.out.println(name);
        }

        // initialCapacity creates and ArrayList of the specified size
        ArrayList<Double> numbers = new ArrayList<>(100);
        numbers.add(47.0);
        System.out.println("Size of numbers " + numbers.size());

        ArrayList<String> names2 = new ArrayList<>(names);
        names2.add("Fred");
        for (String name : names2){
            System.out.println(name);
        }
    }
}
