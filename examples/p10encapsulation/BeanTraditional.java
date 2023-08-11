package p10encapsulation;

public class BeanTraditional {

    private int intVar;
    private String stringVar;
    private boolean boolVar;

    public BeanTraditional(){}

    public int getIntVar(){
        return intVar;
    }

    public void setIntVar(int intVar) {
        this.intVar = intVar;
    }

    public String getStringVar() {
        return stringVar;
    }

    public void setStringVar(String stringVar) {
        this.stringVar = stringVar;
    }

    public boolean isBoolVar() {
        return boolVar;
    }

    public void setBoolVar(boolean boolVar) {
        this.boolVar = boolVar;
    }
}
