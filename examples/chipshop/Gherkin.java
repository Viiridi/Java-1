package chipshop;

public class Gherkin extends Condiments {
	
    protected Fish fish;

    public Gherkin(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", pickled gherkin";
	}

	@Override
	public double cost() {
		return fish.cost() + 0.8;
	}

}
