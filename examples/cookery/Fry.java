package cookery;

public class Fry implements CookingBehaviour {
    @Override
    public void cook() {
        System.out.println("Heat in shallow oil");
    }
}
