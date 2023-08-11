package p07numbers;

import p06statics.Book;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {

    public static void main(String[] args) {

        double d = Double.parseDouble("1234.567");
        System.out.println(d);

        int num = 1;
        num = num + 2;
        num += 3;
        num++;

        int num2 = num++;

        System.out.println(num);
        System.out.println(num2);

        for (int i=1; i <= 10; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }

        System.out.println(5 + 10 + "10");
        System.out.println(Math.round(d));
        System.out.println( (5 + 4) * 3 / 7.0 + 6);
        System.out.println(0.1 * 3);

        BigDecimal bd1 = new BigDecimal("0.1");
        BigDecimal bd2 = new BigDecimal("3");
        System.out.println(bd1.divide(bd2, RoundingMode.DOWN));

    }
}
