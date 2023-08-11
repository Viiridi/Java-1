package p05collections;

import java.util.HashMap;

public class Maps {

    public static void main(String[] args) {

        HashMap<String, Integer> cities = new HashMap<>();
        cities.put("London",9_000_000);
        cities.put("Cairo", 17_000_000);
        cities.put("Sydney", 3_500_000);
        cities.put("Cairo", 18_000_000);

        //System.out.println(cities.get("Cairo"));

        for (String city : cities.keySet()) {
            System.out.println(city + " - " + cities.get(city));
        }

        System.out.println(cities.containsKey("Tokyo"));
        System.out.println(cities.containsValue(1_000_000));
        System.out.println(cities.size());
    }
}
