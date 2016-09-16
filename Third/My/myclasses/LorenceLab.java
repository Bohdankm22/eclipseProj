package myclasses;

import javax.swing.JOptionPane;

public class LorenceLab {

	public static void main(String[] args) {
		int height, weight, weight1;
		String firstName, lastName;
		height = Integer.parseInt(JOptionPane.showInputDialog("Please input your height:"));
//		height = 182;
		weight1 = Integer.parseInt(JOptionPane.showInputDialog("Please input your weight:"));
//		weight1 = 82;
		firstName = JOptionPane.showInputDialog("Please input your name:");
//		firstName = "Bohdan";
		lastName = JOptionPane.showInputDialog("Please input your surname:");
//		lastName = "Sharipov";
		weight = (int) ((height - 100) - (height - 150) / 4);
//		weight1 = (int) ((height - 100) - (height - 150) / 2.5);
//		System.out.println("Last name: " + lastName + ". First name: " + firstName);
		String isMore = weight > weight1 ? "get " : "loose ";
//		System.out.println("Hello, " + firstName + ". You need to " + isMore + Math.abs(weight - weight1) + "kg.");
		JOptionPane.showMessageDialog(null, "Hello, " + firstName + ". You need to " + isMore + Math.abs(weight - weight1) + "kg.", "Gavno", JOptionPane.INFORMATION_MESSAGE);
//		System.out.println("The ideal weight for man is " + weight);
//		System.out.println("The ideal weight for woman is " + weight1);
	}

}
