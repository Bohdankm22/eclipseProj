package assignment1;

import java.awt.Toolkit;

public class Siren {
	private int beepKoef;
	private int silenceKoef;
	private int beebSeconds = 1;
	private int silenceSeconds = 1;
	
	
	public Siren(int beepKoef, int silenceKoef) {
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
			for (int j = 0; j < beepKoef; j++) {
				Toolkit.getDefaultToolkit().beep();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					
				}
			}
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
