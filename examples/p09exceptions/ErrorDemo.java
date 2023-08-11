package p09exceptions;

public class ErrorDemo {

    public static void main(String[] args) {

        new ErrorDemo().doSomething();
    }

    void doSomething() {
        doSomething();
    }
}
