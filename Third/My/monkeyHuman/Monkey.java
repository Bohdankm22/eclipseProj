package monkeyHuman;

public class Monkey extends AnimalCommonBehaviour{

	public void talk() {
		System.out.println("Howling");
	}

	public void standing() {
		System.out.println("Jumping");
	}

	public void craft() {
		System.out.println("Simple tools");
	}
	
	public void balancing(){
		System.out.println("From three to three");
	}

	@Override
	public void fight() {
		// TODO Auto-generated method stub
		
	}

}
