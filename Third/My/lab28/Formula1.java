package lab28;

public class Formula1 extends ISCar {
	
	
	@Override
	int AutomaticCreationRandomNumber(int min, int max, int factor){
		return (int)(Math.random() * factor * (Math.random() > 1 ? min : max));
	}
}
