package main;

import pojos.NumberGuessGame;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        NumberGuessGame game = new NumberGuessGame();

        while (!game.over){
            System.out.printf("Guess a number between %d and %d ", NumberGuessGame.MIN, NumberGuessGame.MAX);
            int number = input.nextInt();
            String message = game.guess(number);
            System.out.println(message);
        }

        System.out.println(game.MIN);
        System.out.println(NumberGuessGame.MAX);
    }
}
