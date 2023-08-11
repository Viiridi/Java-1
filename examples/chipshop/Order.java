package chipshop;

public class Order {

	public static void main(String[] args) {
		
		Fish fish = new CurrySauce(new Gherkin(new Chips(new Cod())));
		System.out.println(fish.getDescription() + " £" + fish.cost());
	}

}
