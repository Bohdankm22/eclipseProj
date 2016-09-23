package william;

import javax.swing.JOptionPane;

public class Lab1013 {
	public static void main (String[] args) {
		int x, y, temp1, temp2;
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
		temp1 = x;
		temp2 = y;
		while ((x!=0)&&(y!=0)){
			int c=y;
			y=x%y;
			x = c;
		}
		JOptionPane.showMessageDialog(null, "The greatest common divisor of "+ temp1 +" and " + temp2 + " is " + x,"Greatest Common Devisor",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
