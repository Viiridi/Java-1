package p10encapsulation;

public record Client(String name) {
    public Client {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("Name must not be blank");
        }
    }
}
