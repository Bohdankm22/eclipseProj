package oopclasses.second;

import javax.swing.JOptionPane;

public class QudrEqWMethMain {

	public static void main(String[] args) {
		double a = userNumber("a");
		double b = userNumber("b");
		double c = userNumber("c");
		SecondEquesion secondEquesion = new SecondEquesion(a, b, c);
		double delta = secondEquesion.calculateDelta();
		JOptionPane.showMessageDialog(null, String.format("The equesion is: (%.2f) x^2 + (%.2f) x + (%.2f) = 0\nDelta = %.2f\nResult: x1 = %.2f and x2 = %.2f", 
			a, b, c, delta, secondEquesion.calculateX(true), secondEquesion.calculateX(false)), 
				"Result", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static double userNumber(String numb) {
		return Double.parseDouble(JOptionPane.showInputDialog(String.format("Input \"%s\" number: ", numb)));
	}
	

}
