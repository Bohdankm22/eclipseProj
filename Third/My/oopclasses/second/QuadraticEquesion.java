package oopclasses.second;

import javax.swing.JOptionPane;

public class QuadraticEquesion {

	public static void main(String[] args) {
		double a = userNumber("a");
		double b = userNumber("b");
		double c = userNumber("c");
		double delta = calculateDelta(a, b, c);
		JOptionPane.showMessageDialog(null, String.format("The equesion is: %.2f x^2 + %.2f x + %.2f = 0\nDelta = %.2f\nResult: x1 = %.2f and x2 = %.2f", a, b, c, delta, calculateX(a, b, delta, true), calculateX(a, b, delta, false)), "Result", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static double userNumber(String numb) {
		return Double.parseDouble(JOptionPane.showInputDialog(String.format("Input \"%s\" number: ", numb)));
	}
	
	private static double calculateDelta(double a, double b, double c) {
		return Math.pow(b, 2) - 4 * a * c;
	}
	
	private static double calculateX(double a, double b, double delta, boolean isFirst) {
		return isFirst ? (-b + Math.sqrt(delta)) / (2 * a) : (-b - Math.sqrt(delta)) / (2 * a);
	}

}
