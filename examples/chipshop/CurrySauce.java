package chipshop;

public class CurrySauce extends Condiments {
	
    protected Fish fish;

    public CurrySauce(Fish fish) {
        this.fish = fish;
    }

	@Override
	public String getDescription() {
		return fish.getDescription() + ", curry sauce";
	}

	@Override
	public double cost() {
		return fish.cost() + 1.25;
	}

}
