package p04control;

public class Switches {

    public static void main(String[] args) {

        int mealDealOption = 3;

        switch (mealDealOption) {
            case 3:
                System.out.println("Drink");
            case 2:
                System.out.println("Fries");
            case 1:
                System.out.println("Burger");
                break;
            default:
                System.out.println("Not on our menu");
        }

        System.out.println();

        switch (mealDealOption) {
            case 3 ->
                System.out.println("Drink");
            case 2 ->
                System.out.println("Fries");
            case 1 ->
                System.out.println("Burger");
            default ->
                System.out.println("Not on our menu");
        }

        int x = 2;

        String result = switch (x) {
            case 1 -> {
                System.out.println("Processing case 1...");
                yield "x is 1";
            }
            case 2 -> {
                System.out.println("Processing case 2...");
                yield "x is 2";
            }
            default -> "neither 1 or 2";
        };

        System.out.println(result);
    }
}
