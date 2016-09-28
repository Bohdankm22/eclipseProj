package bohdan.assignment1;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Siren siren = new Siren(userNumber("beeb koeficient"), userNumber("silence koeficient"));
		int k = userNumberOfIterations("number of iterations");
		siren.fireSiren(k);
	}
	
	private static double userNumber(String numb) {
		return Double.parseDouble(JOptionPane.showInputDialog(String.format("Input %s number: ", numb)));
	}
	
	private static int userNumberOfIterations(String numb) {
		return Integer.parseInt(JOptionPane.showInputDialog(String.format("Input %s number: ", numb)));
	}

}
