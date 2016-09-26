package myclasses.newpack;

import javax.swing.JOptionPane;

public class Check {

	public static void main(String[] args) {	
		String number = (JOptionPane.showInputDialog("Please input string: "));
		JOptionPane.showMessageDialog(null, 
				new StringBuilder(number).reverse().toString(), "Revert", JOptionPane.INFORMATION_MESSAGE);

	}
}
