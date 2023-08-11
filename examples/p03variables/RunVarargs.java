package p03variables;

public class RunVarargs {

    public static void main(String[] args) {

        Varargs varargs = new Varargs();

        //int[] values = {3, 4, 77, -23, 95};
        //System.out.println(varargs.sum(values));

        System.out.println(varargs.sum(3, 4, 77, -23, 95, 25, 42));
    }
}
