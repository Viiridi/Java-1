package main;

import pojos.Planet;

public class App {

    public static void main(String[] args) {

        Planet earth = new Planet();
        earth.name = "Earth";
        earth.avgDistanceFromSun = 92_956_050;
        earth.radius = 3_958.8;
        earth.isTerrestrial = true;
        earth.atmosphericConstituents = new String[] {"Nitrogen", "Oxygen"};

        Planet jupiter = new Planet("Jupiter", 483_638_564, 43_440.7, false,
                new String[] {"Hydrogen", "Helium"});

        System.out.println("Earth's principal atmospheric gas is " + earth.atmosphericConstituents[0]);
        System.out.println("Jupiter's principal atmospheric gas is " + jupiter.atmosphericConstituents[0]);

        System.out.printf("Earth's circumference: %.2f miles\n", earth.circumference());
        System.out.printf("Jupiter's circumference: %.2f miles\n", jupiter.circumference());

        System.out.printf("Jupiter is %d x the distance from the sun compared with Earth\n", jupiter.relativeAvgDistanceFromSunComparedWith(earth));
        System.out.printf("Jupiter is %.2f x the size of Earth\n", jupiter.relativeSizeComparedWith(earth));
        System.out.printf("Jupiter is the same type of planet as is Earth: %s\n", jupiter.isTheSameTypeAs(earth));

    }
}
