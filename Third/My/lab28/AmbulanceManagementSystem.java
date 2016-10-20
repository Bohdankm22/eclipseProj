package lab28;

public class AmbulanceManagementSystem {
	
	public void emergencyAlertAmbulanceDriver(){
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		AmbulanceDriver ad = new AmbulanceDriver();
		ad.accidentOccursStartAmbulanceCar();
	}
}
