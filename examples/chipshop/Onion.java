package chipshop;

public class Onion extends Condiments {
	
    protected Fish fish;

    public Onion(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", pickled onion";
	}

	@Override
	public double cost() {
		return fish.cost() + 0.5;
	}

}
