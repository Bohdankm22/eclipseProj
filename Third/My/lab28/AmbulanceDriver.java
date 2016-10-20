package lab28;

public class AmbulanceDriver extends Driver {
	
	public void accidentOccursStartAmbulanceCar() {
		System.out.println("\n");
		System.out.println("The Ambulance Driver's Phone is ringing ..................");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		System.out.println("\n");
		AmbulanceCar ac = new AmbulanceCar();
		System.out.println("The Ambulance Car has been started ..................");
		System.out.println("\n");
		this.communicateYourPositioning();
		System.out.println("\n");
		ac.EmergencyAlert();
	}
	
	public void communicateYourPositioning() {
		System.out.println("\n");
		System.out.println("Hello, OK, The Emergency Medical Staff is on his way for Assistance…………");
		System.out.println("Please stand by ……………………………………….");
	}
}
