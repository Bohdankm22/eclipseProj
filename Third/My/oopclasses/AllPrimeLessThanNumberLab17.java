package oopclasses;

import javax.swing.JOptionPane;

public class AllPrimeLessThanNumberLab17 {

	public static void main(String[] args) {
		int number;
		while (true) {
			number = Integer.parseInt(JOptionPane.showInputDialog("Please input number: "));
			if (number < 0) {
				JOptionPane.showMessageDialog(null, "Invalid input.\nNumber should be greated than 0.", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				break;
			}
		}
		StringBuilder result = new StringBuilder("1");
		for (int i = 2; i <= number; i++) {
			int count = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0) 
					count++;
			}
			if (count == 2)
				result.append(", " + i);
		}
		JOptionPane.showMessageDialog(null, String.format("All prime numbers for %d is %s", number, 
				result), "Revert", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
