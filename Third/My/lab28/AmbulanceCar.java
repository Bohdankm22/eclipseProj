package lab28;

import assignment1.Siren;

public class AmbulanceCar extends Car {
	
	Siren siren = new Siren(3, 2);
	
	public void EmergencyAlert() {
		siren.fireSiren(5);
	}
}
