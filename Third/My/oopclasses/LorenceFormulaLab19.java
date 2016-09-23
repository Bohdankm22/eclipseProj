package oopclasses;

import javax.swing.JOptionPane;

public class LorenceFormulaLab19 {

	public static void main(String[] args) {
		double height, weight, weight1;
		String firstName, lastName;
		height = Double.parseDouble(JOptionPane.showInputDialog("Please input your height in meter:"));
		weight1 = Double.parseDouble(JOptionPane.showInputDialog("Please input your weight in kg:"));
		firstName = JOptionPane.showInputDialog("Please input your name:");
		lastName = JOptionPane.showInputDialog("Please input your surname:");
		weight = ((height * 100 - 100) - (height * 100 - 150) / 4);
		String word = weight >= weight1 ? "gain" : "loose";
		JOptionPane.showMessageDialog(null, String.format("%s %s, you need to %s %.2fkg.", firstName, lastName, word, Math.abs(weight - weight1)));	
	}

}
