package bohdan.jframe;

public class Assignment3Main {

	public static void main(String[] args) {
		
		for (int i = 0; i < 50; i++) {
			Assignment3JFrame jf = new Assignment3JFrame();
			jf.setVisible(true);
			sleepSec(1);
			jf.setVisible(false);
			sleepSec(1);
		}
		

	}

	private static void sleepSec(long time) {
		try {
			Thread.sleep(time * 1000);
		} catch (InterruptedException e) {
			System.out.println("Error occured: " + e.getMessage());
		}
	}
}
