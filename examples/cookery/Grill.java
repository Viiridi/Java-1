package cookery;

public class Grill implements CookingBehaviour {
    @Override
    public void cook() {
        System.out.println("Place it under a heat source");
    }
}
