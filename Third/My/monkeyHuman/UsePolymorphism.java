package monkeyHuman;

public class UsePolymorphism {

	public static void main(String[] args) {
		Monkey Bobo = new Monkey();
		Human John = new Human();
		Monkey Bobo2 = new Monkey();
		Human John2 = new Human();
		
		Bobo.craft();
		System.out.println("");
		
		John.fight();
		System.out.println("");
		
		//Bobo.fight();
		//System.out.println("");
		
		//John.balancing();
		//System.out.println("");
		
		John2.breath();
		System.out.println("");
		Bobo2.sleep();
		System.out.println("");
		
		//John2.run();
		//System.out.println("");
		//Bobo2.fly();
		//System.out.println("");
	}

}
