package oopclasses;

import javax.swing.JOptionPane;

public class MultTableLab15 {

	public static void main(String[] args) {
		StringBuilder text = new StringBuilder("");
		for (int i = 0; i <= 10; i++) {
			text.append(printNumberMultipleTo6(i));
		}
		JOptionPane.showMessageDialog(null, text, "Table", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static String printNumberMultipleTo6(int number) {
		return String.format("6 x %d = %d\n", number, 6 * number);
	}

}
