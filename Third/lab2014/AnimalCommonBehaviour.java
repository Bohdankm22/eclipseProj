package lab2014;

public abstract class AnimalCommonBehaviour implements Animals {
	public void sleep(){
		System.out.println("Eyes closed");
		}
	public void breath(){
		System.out.println("Inhaling and exhaling");
		}
	public abstract void talk();
	public abstract void standing();
	public abstract void craft();
}
