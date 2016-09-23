package oopclasses;

import javax.swing.JOptionPane;

public class FactorialLab14 {

	public static void main(String[] args) {
		boolean exit = false;
		while (!exit) {
			int number = Integer.parseInt(JOptionPane.showInputDialog("Please input number: "));
			JOptionPane.showMessageDialog(null, String.format("Factorial of %d is %d", number, calcFact(number)), " ", JOptionPane.INFORMATION_MESSAGE);
			String answer = JOptionPane.showInputDialog("Do you want to continue? (Y/y) or (N/n)");
			if (answer.toLowerCase().equals("y")) {
				continue;
			} else if(answer.toLowerCase().equals("n")) {
				System.exit(0);
			} else {
				JOptionPane.showMessageDialog(null, "Invalid input", " ", JOptionPane.ERROR_MESSAGE);
			}
		}
	}
	
	// Method calculates number factorial using recursion
	private static long calcFact(int numb) {
		return numb == 1 ? 1 : numb * calcFact(numb -1);
	}

}
