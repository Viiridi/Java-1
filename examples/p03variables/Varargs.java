package p03variables;

public class Varargs {

    public int sum(int... values){
        int total = 0;

        for (int i=1; i < values.length; i++){
            total = total + values[i];
        }

        return total;
    }
}
