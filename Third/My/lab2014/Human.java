package lab2014;

public class Human extends AnimalCommonBehaviour{
	public void talk() {
		System.out.println("Structured speech");
	}

	public void standing() {
		System.out.println("Only with 2 feet");
	}

	public void craft() {
		System.out.println("From simple to complex tools");
	}
	
	public void fight(){
		System.out.println("War");
	}

	@Override
	public void balancing() {
		// TODO Auto-generated method stub
		
	}

}
