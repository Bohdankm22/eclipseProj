package oopclasses;

import javax.swing.JOptionPane;

public class Lab13 {

	public static void main(String[] args) {
		int first = Integer.parseInt(JOptionPane.showInputDialog("Please input first number: "));
		int second = Integer.parseInt(JOptionPane.showInputDialog("Please input second number: "));
		int gcd = first >= second ? second + 1 : first + 1;
		boolean found = false;
		while (!found) {
			gcd--;
			if (first % gcd == 0 && second % gcd == 0) {
				found = true;
			}
		}
		JOptionPane.showMessageDialog(null, String.format("GCD for %d and %d is %d", first, second, gcd), " ", JOptionPane.INFORMATION_MESSAGE);
	}

}
