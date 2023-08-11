package p05collections;

public class Arrays {

    public static void main(String[] args) {

        String[] names = {"David","Sarah","Fiona","Simon"};
        names[3] = "Gerry";

        for (String name : names) {
            System.out.println(name);
        }

        String[] names2 = new String[3];
        System.out.println("names2 element 1");
        //System.out.println(names2[1].toUpperCase());

        String[][] multiDimension = new String[3][4];
        multiDimension[0][0] = "Hello";
    }
}
