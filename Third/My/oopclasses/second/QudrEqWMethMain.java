package oopclasses.second;

import javax.swing.JOptionPane;

public class QudrEqWMethMain {

	public static void main(String[] args) {
		double a = userNumber("a");
		double b = userNumber("b");
		double c = userNumber("c");
		QuadrEqWithMethods quadrEqWithMethods = new QuadrEqWithMethods(a, b, c);
		double delta = quadrEqWithMethods.calculateDelta();
		JOptionPane.showMessageDialog(null, String.format("The equesion is: (%.2f) x^2 + (%.2f) x + (%.2f) = 0\nDelta = %.2f\nResult: x1 = %.2f and x2 = %.2f", 
			a, b, c, delta, quadrEqWithMethods.calculateX(true), quadrEqWithMethods.calculateX(false)), 
				"Result", JOptionPane.INFORMATION_MESSAGE);
	}
	
	private static double userNumber(String numb) {
		return Double.parseDouble(JOptionPane.showInputDialog(String.format("Input \"%s\" number: ", numb)));
	}
	

}
