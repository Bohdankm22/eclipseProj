package william;

import javax.swing.JOptionPane;

public class Lab1_20 {

	public static void main(String[] args) {
		int num = Integer.parseInt(JOptionPane.showInputDialog("Enter a number"));
		String msg = "";
			for (int b = 1; b < num; b++) {
				for (int a = 1; a < b; a++) {
					if ((a*a + b*b + 1) % (a*b) == 0) //if it is divisible 
						msg += "( " + a + " " + b + " ) "; 
				}
					
			}
			JOptionPane.showMessageDialog(null, "Pair of integers below " + num + " are " + msg);
			}



}
