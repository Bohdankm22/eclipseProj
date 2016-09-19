package myclasses;

import javax.swing.JOptionPane;

public class LorenceLab {

	public static void main(String[] args) {
		double height, weight, weight1;
		String firstName, lastName;
		height = Double.parseDouble(JOptionPane.showInputDialog("Please input your height in meter:"));
		firstName = JOptionPane.showInputDialog("Please input your name:");
		lastName = JOptionPane.showInputDialog("Please input your surname:");
		weight = ((height * 100 - 100) - (height * 100 - 150) / 4);
		JOptionPane.showMessageDialog(null, String.format("WEIGHT PROGRAMM MONITORING\n _______________________________\n\n%s%9s%s\n%s%10s%s\n%s%15s%.2f\n%s%7s%.2f", 
					"First name:", " ", firstName, "Last name:", " ", lastName, "Height:", " ", height, "Ideal weight:", " ", weight));
	}

}
