package p04control;

public class Loops {

    public static void main(String[] args) {

        int count = 1;

        while (count <= 5) {
            System.out.println(count);
            count++;
        }

        do {
            System.out.println(count);
            count++;
        } while (count <= 10);

        String[] places = {"London","Edinburgh","Cardiff","Belfast"};

        for (int i = places.length - 1; i >= 0; i--) {
            System.out.println(places[i]);
        }

        System.out.println();

        for (String city : places) {
            System.out.println(city);
        }
    }
}
