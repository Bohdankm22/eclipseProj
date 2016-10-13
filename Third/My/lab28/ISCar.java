package lab28;

public class ISCar extends Car
{ 
	//Attributes
	int minFactor; //lowest  limit factor of the random number
	int maxFactor; //highest limit factor of the random number 
	int speedFactor; //number to be multiply by the random number
			
	//Constructor that instantiate a car that uses the mother constructor from 
      //the car class. This car should have a name and the min, max, and factor   
      //parameters to be used to generate a random number
	public ISCar(String name, int minFactor, int maxFactor, int speedFactor) {
		super(name);
		this.minFactor = minFactor;
		this.maxFactor = maxFactor;
		this.speedFactor = speedFactor;
	}
	//Constructor that uses the mother constructor from the car class 
    // This constructor will create a new car with a name, and starts the race 
    //with an initial speed given by the player as a parameter to the 
    //constructor during its creation and the min, max, and factor parameters 
    //to be used to generate a random number
	public ISCar(String name) {
		super("toyCar");
        
	}
	
	public ISCar() {
		super("toyCar");
	}
	
    public int getMinFactor()
    {
    	return this.minFactor;
    }
    
    public int getMaxFactor()
    {
    	return this.maxFactor;
    }
    
    public int getSpeedFactor()
    {
    	 return this.speedFactor;
    }
	
    public void setMinFactor(int newMinF)
    {
    	 this.minFactor = newMinF;
    }
    
    public void setMaxFactor(int newMaxF)
    {
    	 this.maxFactor = newMaxF;
    }
    
    public void setSpeedFactor(int newSf)
    {
    	 this.speedFactor=newSf;
    }
	
	//Method that generates a random number between minx10 and maxx10
    int AutomaticCreationRandomNumber(int min, int max, int factor){
	int myRandomInt = (int)(Math.random() * factor * (Math.random() > 0.5 ? min : max));
		return myRandomInt;
	}
}    