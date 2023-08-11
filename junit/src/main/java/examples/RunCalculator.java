package examples;

public class RunCalculator {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();
        int result = calculator.add(4,7);
        System.out.println(result);
    }
}
