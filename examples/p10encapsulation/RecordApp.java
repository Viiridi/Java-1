package p10encapsulation;

public class RecordApp {

    public static void main(String[] args) {

        Client client = new Client("Fred Smith");
        System.out.println(client.name());
    }
}
