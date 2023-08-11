package main;

import pojos.Journey;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);
        Journey journey = new Journey();
        System.out.printf("Distance (miles): ");
        journey.distance = keyboard.nextDouble();
        System.out.printf("Average speed (mph): ");
        journey.averageSpeed = keyboard.nextDouble();
        System.out.printf("Journey time: %s hours", journey.getTime());
    }
}
