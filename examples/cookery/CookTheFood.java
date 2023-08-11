package cookery;

public class CookTheFood {

    public static void main(String[] args) {

        Food food = new Food("Salmon", new Fry());
        food.cook();
        food.setCookingBehaviour(new Poach());
        food.cook();
        food.setCookingBehaviour(new Grill());
        food.cook();
    }
}
