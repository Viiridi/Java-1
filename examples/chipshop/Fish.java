package chipshop;

public abstract class Fish {
	
    protected String description = "Unknown fish";

    public String getDescription() {
        return description;
    }

    public abstract double cost();

}
