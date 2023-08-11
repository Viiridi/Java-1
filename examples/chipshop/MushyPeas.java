package chipshop;

public class MushyPeas extends Condiments {
	
    protected Fish fish;

    public MushyPeas(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", mushy peas";
	}

	@Override
	public double cost() {
		return fish.cost() + 1.5;
	}

}
