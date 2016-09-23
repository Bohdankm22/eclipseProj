package oopclasses;

import java.util.Random;

import javax.swing.JOptionPane;

public class GuessingGame21 {
	private int randomNumber = new Random().nextInt(101);
	private int userScore = 100;

	public static void main(String[] args) {
		GuessingGame21 guessingGame21 = new GuessingGame21();
		guessingGame21.game();
	}

	private void game() {
		int number;
		while (true) {
			while (true) {
				number = Integer.parseInt(JOptionPane.showInputDialog("Please enter your guess between 0 and 100: "));
				String word = number > randomNumber ? "greater" : "less";
				if (number == randomNumber) {
					JOptionPane.showMessageDialog(null, String.format("Congradulations!\nYour score is %d", userScore), "Game", JOptionPane.INFORMATION_MESSAGE);
					break;
				} else if (userScore <= 0) {
					JOptionPane.showMessageDialog(null, String.format("Sorry, Game is over!"), "Game", JOptionPane.INFORMATION_MESSAGE);
					break;
				
				} else {
					userScore -= 10;
					JOptionPane.showMessageDialog(null, String.format("The number you entered is %s than win number!\n"
							+ "Numbere of remaining chances is %d\nYour related score is %d", word, userScore / 10, userScore), "Game", JOptionPane.INFORMATION_MESSAGE);
				
				}
			}
			String answer = JOptionPane.showInputDialog("Do you want to play again? Yes(Y/y) No(N/n)");
			if (answer.toLowerCase().equals("y")) {
				randomNumber = new Random().nextInt(101);
				userScore = 100;
			} else {
				System.exit(0);
			}
		}
	}

}
