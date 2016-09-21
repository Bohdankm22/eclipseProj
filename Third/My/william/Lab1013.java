package william;

import javax.swing.JOptionPane;

public class Lab1013 {
	public static void main (String[] args) {
		int x, y;
		x = Integer.parseInt(JOptionPane.showInputDialog("Enter the first number"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Enter the second number"));
		
		while ((x!=0)&&(y!=0)){
			int c=y;
			y=x%y;
			x = c;
		}
		JOptionPane.showConfirmDialog(null, "The greatest common divisor is "+x,"LCM",JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
