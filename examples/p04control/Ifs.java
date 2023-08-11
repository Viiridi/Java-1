package p04control;

public class Ifs {

    public static void main(String[] args) {

        int num = 6;

        if (num == 5) {
            System.out.println("num is 5");
        } else if (num < 5) {
            System.out.println("num is less than 5");
        } else {
            System.out.println("num is greater than 5");
        }

        String ternary = (num > 3) ? "on" : "off";
/*
        if (num > 3) {
            ternary = "on";
        } else {
            ternary = "off";
        }
*/
        System.out.println(ternary);
    }
}
