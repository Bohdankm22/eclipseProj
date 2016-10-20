package lab28;

public class Formula1Version2 extends Formula1 {
	
	public Formula1Version2(String name, int is, int i, int j, int k) {
		super(name, is, i, j, k);
	}
	
	public Formula1Version2(String name, int i, int j, int k) {
		super(name, i, j, k);
	}
	
	public void ElectronicCrashDetection() {
		System.out.println("\n");
		AlertAmbulanceManagementSystem();
	}
	
	public void AlertAmbulanceManagementSystem() {
		System.out.println("\n");
		System.out.println("The Catastrophe Automatic Detection is triggered by the Car Controller System.");
		System.out.println("\n");
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			System.out.println("Error");
		}
		System.out.println("The Ambulance Remote System is alerted. Please Wait  ! ! ! ! ! ! ! ! ! ! ! ! !");
		AmbulanceManagementSystem ams = new AmbulanceManagementSystem ();
		ams.emergencyAlertAmbulanceDriver();
	}
}
