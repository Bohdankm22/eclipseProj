package myclasses;

import javax.swing.JOptionPane;

public class ExampleOfJOption {

	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog("Please input your name:");
		JOptionPane.showMessageDialog(null, "Eclipse GAVNO", "Gavno", JOptionPane.ERROR_MESSAGE);
	}

}
