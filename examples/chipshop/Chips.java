package chipshop;

public class Chips extends Condiments {
	
    protected Fish fish;

    public Chips(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", chips";
	}

	@Override
	public double cost() {
		return fish.cost() + 2.0;
	}

}
