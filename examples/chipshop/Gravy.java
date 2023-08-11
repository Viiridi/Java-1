package chipshop;

public class Gravy extends Condiments {
	
    protected Fish fish;

    public Gravy(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", gravy";
	}

	@Override
	public double cost() {
		return fish.cost() + 1.0;
	}

}
