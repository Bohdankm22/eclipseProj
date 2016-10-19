package lab28;

public class Formula1 extends ISCar {
	
	public Formula1(String name, int is, int i, int j, int k) {
		super(name, is, i, j, k);
	}
	
	public Formula1(String name, int i, int j, int k) {
		super(name, i, j, k);
	}
	
	

	@Override
	int AutomaticCreationRandomNumber(int min, int max, int factor){
		return (int)(Math.random() * factor * (Math.random() > 1 ? min : max));
	}
}
