package cookery;

public class Poach implements CookingBehaviour {
    @Override
    public void cook() {
        System.out.println("Simmer in hot water");
    }
}
