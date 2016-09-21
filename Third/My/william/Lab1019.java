package william;

import javax.swing.JOptionPane;

public class Lab1019 {
	public static void main (String[] args) {
		double h, w1, iw, w2;
		String fN, lN, m, g, mg;
		fN = JOptionPane.showInputDialog("Provide your first name and press OK");
		lN = JOptionPane.showInputDialog("Provide your last name and press OK");
		h = Double.parseDouble(JOptionPane.showInputDialog("Provide your height and press OK"));
		w1 = Double.parseDouble(JOptionPane.showInputDialog("Provide your height and press OK"));
		g = JOptionPane.showInputDialog("Provide your gender");
		if (g.equals("m")||g.equals("M")){
			iw = ((h*100)-100)-((h*100)-150)/4;
		}
		else{
			iw = ((h*100)-100)-((h*100)-150)/2.5;
		}
		if(w1<iw){
			m="win";
			w2=iw-w1;
		}
		else {
			m="lose";
			w2=w1-iw;
		}
		mg = String.format("Hello "+fN+" "+lN+", you need to "+m+" "+w2+" kgs");
		JOptionPane.showMessageDialog(null, mg,"Ideal Weight",JOptionPane.INFORMATION_MESSAGE);
	}
}
