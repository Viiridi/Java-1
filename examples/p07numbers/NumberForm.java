package p07numbers;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberForm {

    public static void main(String[] args) {

        double dNum = 42786.6458794;

        String sNum = String.format("%,.2f", dNum);
        System.out.println(sNum);

        System.out.printf("%,.2f\n", dNum);

        NumberFormat uk = NumberFormat.getCurrencyInstance(Locale.UK);
        System.out.println(uk.format(dNum));

        NumberFormat de = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        System.out.println(de.format(dNum));

        NumberFormat cf = NumberFormat.getCurrencyInstance(Locale.CANADA_FRENCH);
        System.out.println(cf.format(dNum));
    }
}
