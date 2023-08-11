package cookery;

public class Food {

    private String description;
    private CookingBehaviour cookingBehaviour;

    public Food(String description, CookingBehaviour cookingBehaviour) {
        this.description = description;
        this.cookingBehaviour = cookingBehaviour;
    }
    // delegate method
    public void cook() {
        cookingBehaviour.cook();
    }

    public CookingBehaviour getCookingBehaviour() {
        return cookingBehaviour;
    }

    public void setCookingBehaviour(CookingBehaviour cookingBehaviour) {
        this.cookingBehaviour = cookingBehaviour;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
