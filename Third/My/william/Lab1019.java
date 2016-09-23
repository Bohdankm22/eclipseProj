package william;

import javax.swing.JOptionPane;

public class Lab1019 {
	public static void main (String[] args) {
		double h, w1, iw, w2;
		String fN, lN, m, g, mg;
		fN = JOptionPane.showInputDialog("Please enter your First Name");
		lN = JOptionPane.showInputDialog("Please enter your Last Name");
		h = Double.parseDouble(JOptionPane.showInputDialog("Please enter your height in metres"));
		w1 = Double.parseDouble(JOptionPane.showInputDialog("Please enter your weight in Kg"));
		g = JOptionPane.showInputDialog("Please enter your Gender");
		if (g.equals("m")||g.equals("M")){
			iw = ((h*100)-100)-((h*100)-150)/4;
		}
		else{
			iw = ((h*100)-100)-((h*100)-150)/2.5;
		}
		if(w1<iw){
			m="gain";
			w2=iw-w1;
		}
		else {
			m="lose";
			w2=w1-iw;
		}
		
		mg = String.format("Hello "+fN+" "+lN+", you need to "+ m+" "+w2+" kgs");
		JOptionPane.showMessageDialog(null, mg,"Ideal Weight",JOptionPane.INFORMATION_MESSAGE);
	}
}
