package william;

import javax.swing.JOptionPane;

public class IdealWeight {
	public static void main (String[] args) {
		double h, w;
		String fN, lN, m;
		fN = JOptionPane.showInputDialog("Provide your first name and press OK");
		lN = JOptionPane.showInputDialog("Provide your last name and press OK");
		h = Double.parseDouble(JOptionPane.showInputDialog("Provide your height and press OK"));
		w = ((h*100)-100)-((h*100)-150)/4;
		m = String.format("WEIGHT REPORT MONITORING")+String.format("---------------------")+
				String.format(" ")+String.format("First Name: "+fN)+String.format("Last Name: "+lN)+
				String.format("Height: "+h)+String.format("Ideal Weight: "+w);
		JOptionPane.showMessageDialog(null, m,"Ideal Weight",JOptionPane.INFORMATION_MESSAGE);
		
	}
}
