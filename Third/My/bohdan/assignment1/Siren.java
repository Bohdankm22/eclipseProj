package bohdan.assignment1;

public class Siren {
	private double beepKoef;
	private double silenceKoef;
	private int beebSeconds = 1;
	private int silenceSeconds = 1;
	
	public Siren(double beepKoef, double silenceKoef) {
		this.beepKoef = beepKoef;
		this.silenceKoef = silenceKoef;
	}

	private double getBeepKoef() {
		return beepKoef;
	}

	private double getSilenceKoef() {
		return silenceKoef;
	}
	
	public void fireSiren(int numberOfIterations) {
		System.out.println("Start:");
		for (int i = 0; i < numberOfIterations; i++) {
			System.out.println("Beeb start.");
			sleepSeconds(this.beebSeconds * getBeepKoef());
			System.out.println("Beeb end.");
			System.out.println("Silence start.");
			sleepSeconds(this.silenceSeconds * getSilenceKoef());
			System.out.println("Silence end!");
		}
	}
	
	private static void sleepSeconds(double k) {
		try {
			System.out.println(String.format("Sleeping %f seconds", k));
			Thread.sleep(Math.round(1000 * k));
		} catch (InterruptedException e) {
			System.err.println("ERROR sleeping!");
		}
	}
	
	
}
