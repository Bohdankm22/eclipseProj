package oopclasses;

import javax.swing.JOptionPane;

public class TwoDigByFormulaLab20 {

	public static void main(String[] args) {
		int number = Integer.parseInt(JOptionPane.showInputDialog("Please input 2 digit number: "));
		StringBuilder result = new StringBuilder();
		for (int i = 1; i < number; i++) {
			for (int j = i; j < number; j++) {
				if ((Math.pow(i, 2) + Math.pow(j, 2) + 1) % (i * j) == 0) {
					result.append(String.format("(%d, %d)\n", i, j));
				}
			}
		}
		JOptionPane.showMessageDialog(null, String.format("Result is: %s", result), "Pairs", JOptionPane.INFORMATION_MESSAGE);
	
	}

}
