package oopclasses;

import javax.swing.JOptionPane;

public class RevertTwoDigitNumberLab16 {

	public static void main(String[] args) {
		int number;
		while (true) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Please input 2 digit number: "));
			if (number < 10 || number >= 100) {
				JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				break;
			}
		}
		JOptionPane.showMessageDialog(null, String.format("Revert number for %d is %s", number, 
				new StringBuilder(Integer.toString(number)).reverse()), "Revert", JOptionPane.INFORMATION_MESSAGE);
	}

}
