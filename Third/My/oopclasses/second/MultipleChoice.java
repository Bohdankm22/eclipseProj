package oopclasses.second;

import javax.swing.JOptionPane;

public class MultipleChoice {

	public static void main(String[] args) {
		boolean isPower = isPower();
		int firstNumb = userNumber("first");
		JOptionPane.showMessageDialog(null, String.format("Result of %s for %d is %.2f", isPower ? "power" : "square root", firstNumb, isPower ? Math.pow(firstNumb, 2) : Math.sqrt(firstNumb)), "Result", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static boolean isPower() {
		String answer;
		while (true) {
			answer = JOptionPane.showInputDialog("Do you want to perform Power operation (Press \"P\" or \"p\") or Squire root (Press \"R\" or \"r\")");
			if (!answer.toLowerCase().equals("p") && !answer.toLowerCase().equals("r")) {
				JOptionPane.showMessageDialog(null, "Invalid input", "Error", JOptionPane.ERROR_MESSAGE);
			} else {
				break;
			}
		}
		return answer.toLowerCase().equals("p");
	}
	
	private static int userNumber(String numb) {
		return Integer.parseInt(JOptionPane.showInputDialog(String.format("Input %s number: ", numb)));
	}

}
