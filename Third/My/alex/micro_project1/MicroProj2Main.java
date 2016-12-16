package alex.micro_project1;

import oopclasses.GuessingGame21;

public class MicroProj2Main {
	static boolean cont = true;

	public static void main(String[] args) {
			Soundtest sound = new Soundtest();

			GuessingGame21 guessingGame21 = new GuessingGame21();
			Thread music = new Thread(new Runnable() {
				@Override
				public void run() {
					while(cont) {
						sound.startPlaying();
					}
				}	
			});
			music.setDaemon(true);
			music.start();
			guessingGame21.game();
			cont = false;
			System.exit(0);
			System.out.println("exit");
	}

}
