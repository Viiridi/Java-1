package main;

import pojos.RightAngleTriangle;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        RightAngleTriangle triangle = new RightAngleTriangle();
        System.out.printf("Length of opposite side: ");
        triangle.opposite = input.nextDouble();
        System.out.printf("Length of adjacent side: ");
        triangle.adjacent = input.nextDouble();

        System.out.printf("Unknown angle: %.2f%n", triangle.unknownAngle());
        System.out.printf("Unknown side: %.2f%n", triangle.unknownSide());

    }
}
